---
name: ingest
description: Ingest technical PDF books from the user's personal library into this repo's persistent knowledge base (doc/references, the CLAUDE.md index, and doc/Study.md). Trigger whenever the user adds new books to their library and wants the content available to Claude for coding and best-practice guidance, or explicitly asks to "ingest", "re-ingest", or "process" books, PDFs, or the library. Accepts an optional folder or single-file path argument; without one, scans the default library root and skips books already ingested. Always dispatches the extraction as a background/detached agent so the user's terminal stays free.
---

# Ingest

Extracts distilled, always-available knowledge from PDF books into this repo, so future Claude Code sessions can draw on it for coding and best-practice guidance. This mirrors the pipeline first used to build the initial reference library — see git history around `doc/references/` if the exact prior wording is needed.

## 1. Resolve scope from the argument

- **Default library root**: `D:\IT\BOOKS`
- **Permanently excluded**: `ADF/` and `Legacy/` (an exact duplicate of `ADF/`, confirmed by checksum). The user explicitly asked for this content to be kept out of `doc/references/` and `doc/Study.md`. Never process these folders, even under a bare no-argument full-library scan. If a book under one of these folders is passed as an explicit single-file path, ask for confirmation before proceeding rather than silently processing it.
- If invoked with a folder path: treat every PDF under that folder (recursively) as in scope, excluded folders above still apply.
- If invoked with a single file path: treat only that file as in scope, and always (re)process it even if a matching reference file already exists — an explicit path is an explicit request.
- If invoked with no argument: scan the full default library root recursively, minus the excluded folders above.

## 2. Skip what's already covered

Before processing a book (only applies to the no-argument / folder-scan case, not an explicit single-file request):

- Compute the topic as the book's full relative folder path under the library root (e.g. `Java`, `Design Patterns`, or a nested path like `Distributed systems/Messaging/Kafka`) and a short kebab-case slug from the filename.
- If `doc/references/<Topic>/<slug>.md` already exists, skip the book — it's already ingested.
- Detect byte-identical duplicates across folders via checksum (`md5sum` or equivalent) before processing, and skip duplicates the same way the original `Legacy/` vs `ADF/` duplicates were skipped — note the duplicate in the run summary instead of writing a second copy.

## 3. Per-book extraction

For each in-scope, not-yet-ingested book:

1. Get the page count cheaply via the system Python's `pypdf`: `python -c "import pypdf; print(len(pypdf.PdfReader(r'PATH').pages))"` (quote the path; Windows paths under this library contain spaces).
2. Read the table of contents / first ~20 pages to learn the book's structure and scope. Prefer the Read tool (PDFs over 10 pages require a `pages` range like `"1-20"`, max 20 pages per call); if the Read tool's PDF renderer is unavailable in the current environment, fall back to `pdftotext` (poppler, present on this machine) piped through `grep`/`Read` on the resulting text — the fallback tool doesn't excuse shallower sampling, the breadth requirement in step 3 still applies in full.
3. **Sample every major chapter that plausibly bears on the book's core subject, not just an introduction plus a couple of targeted greps.** A short guide might genuinely need only 2-3 reads; a dense 300+ page technical reference — the kind of book this library mostly contains — needs a pass through most or all of its chapters, because that density is exactly why the book was worth adding. Do **not** attempt full verbatim transcription, and do not pad with filler — the goal is exhaustive *coverage of what's technically load-bearing* (mechanisms, configuration, failure modes, trade-offs), not exhaustive page count. If a book's title or table of contents signals a distinct value area other sources in the same topic don't cover (e.g. one book is the deepest source on security, another on internals), prioritize sampling depth there.
4. Write one condensed Markdown file distilling what was learned, in your own words, organized under clear headings — a knowledge distillation, not a copy of the source text. Apply narrative form (Section 4a) here too: a labeled "**What**/**Why**/**How**" bullet per concept is a useful checklist while *drafting*, but the finished paragraph should read as connected prose that happens to cover all three, not three disconnected labeled fragments.

## 4. Style rules (non-negotiable, established repo conventions)

- Every acronym or abbreviation must be expanded into its full phrase the first time it appears in each document, with the acronym parenthesized immediately after, e.g. "Object-Relational Mapping (ORM)". Subsequent uses in the same file may use the short form. No exceptions, even for acronyms that feel obvious.
- Be direct and information-dense — no filler prose, no restating the obvious, no comments explaining what's already clear from headings.
- No emojis.
- **Every concept covered must answer three questions, in this order**: **what** it is (a precise definition, not a synonym restated), **why** it exists or matters (the problem it solves, the alternative it beats, or the failure mode it prevents), and **how** it actually works (the mechanism, not just the name) — an implementation example (code, config, command, or manifest) wherever one meaningfully clarifies the mechanism.
- **Deep, not verbose**: depth means precision and mechanism (exact thresholds, exact failure modes, exact trade-offs), not length. Cut any sentence that restates a point already made elsewhere in the same document in different words — say it once, well, in the most relevant place, and cross-reference from other spots instead of re-explaining. This does **not** mean cutting the connective prose that Section 4a requires — a transition sentence explaining *why* the next paragraph follows is substance, not the kind of restatement this rule forbids.
- **No redundancy across sources**: when multiple books cover the same concept, synthesize one clear explanation rather than stacking each book's version back to back. Attribute a source only when it adds a genuinely distinct angle, number, or example the others don't.

### 4a. Narrative form — write for a human reading start to finish, not a lookup table

This is a criterion in its own right, not a subset of the style rules above, and it overrides the *default* shape of the writing wherever it applies. It came from direct user feedback: content that is individually accurate but lands as an unconnected pile of "**bold term**: definition" bullets is a failure of this skill, even when every fact in it is correct and deep. A reader can verify any single bullet but cannot follow *why* the document moves from one concept to the next, or build a working mental model — which is the entire point of `doc/Study.md` existing.

- **Write the way a textbook chapter, a university lecture, or a good science-communication piece is written**: one idea motivates the next. Introduce a concept via the problem it solves or the question it answers, explain how it solves that problem, and let it set up whatever concept follows — e.g. "a write surviving a crash needs to be protected from concurrent access while it's in flight — that protection is isolation, and it comes in several strengths because full protection is expensive, which is why real databases let you choose..." A reader moving through a section top to bottom should feel *led somewhere*, not handed a stack of index cards in no particular order.
- **Connective tissue that carries meaning is required, not filler.** A transition explaining *why* the next paragraph follows from this one, a motivating question posed before its answer, a sentence naming what a mechanism actually buys you before detailing it — these are substance. What's still forbidden, unchanged from the rules above: restating a fact already established, padding sentence length without adding information, or narrating something already obvious from the heading structure.
- **Bullets, tables, and code blocks are still the right tool for anything genuinely list-shaped** — a table of isolation levels against the anomalies each prevents, a reference of the six `kubectl` commands used daily, a config-key/value pairing. The rule is not "eliminate bullets," it's "stop using a bullet list as the default container for conceptual explanation." If understanding a passage requires grasping how idea A relates to idea B and *why that relationship holds*, it needs prose. If it's genuinely a flat set of interchangeable facts a reader will scan and look up, a list remains correct and should not be forced into artificial narrative.
- **Model the tone on how a specialist actually explains something to an intelligent non-specialist** — a senior engineer walking a new hire through a system at a whiteboard, or a popular-science writer explaining a real mechanism to a general audience — not a certification exam's bullet-point cram sheet. The reader should never have to supply the missing connection themselves.
- **Nothing gets introduced without context — a concept must never just appear.** Before naming a new term or mechanism, ground it: what situation makes it necessary, what would go wrong without it, or what earlier idea it's building on. A sentence that opens with an unexplained proper noun or acronym and only defines it afterward is exactly the "appeared by magic" failure mode this rule exists to prevent — the reader should always know *why this is coming up now* before they're asked to absorb *what it is*. This is the same discipline as good technical writing or teaching: motivate, then define, then explain the mechanism — never define first and hope the motivation becomes obvious in hindsight.
- **The what/why/how requirement (Section 4) still applies to every concept — it's the criterion for content, Section 4a is the criterion for form.** They must both be satisfied at once, and satisfying form must never come at the cost of dropping the what/why/how substance. Concretely: **the first time a concept is introduced**, the surrounding prose must give a reader everything they'd need — what it is, why it exists (the problem/question that motivated it), and how it actually works (the mechanism) — and, where it's the kind of concept that has them, its architecture (the pieces it's made of and how they relate), its design (why it was built that way instead of some other way), and its concrete implementation (what using it actually looks like, ideally a runnable example). **None of this is a template to fill in as labeled sub-bullets** — do not write "What: ... Why: ... How: ..." as visible headings inside `doc/Study.md` prose; the labels were only ever a drafting aid (see Section 3, step 4). Weave the substance into connected sentences instead, and let which of what/why/how/architecture/design/implementation gets more or less space follow the concept's own nature — a simple utility function may only need a sentence of "why," while a protocol like a consensus algorithm may need real space on "how." Once a concept has been properly introduced once, later mentions can just use it by name — the full grounding is a first-use obligation, exactly like the acronym-expansion rule elsewhere in this document.

## 5. Output locations

- One file per book: `doc/references/<Topic>/<slug>.md`, `<Topic>` matching the library subfolder name.
- Optionally, one `doc/references/<Topic>/README.md` per topic giving a one-paragraph overview — only add if it adds value beyond a flat file list.

## 6. Update the CLAUDE.md index

`CLAUDE.md` at the repo root is always loaded into every session, so it must stay a thin index, never the content itself:

- Create the file if it doesn't exist.
- Maintain a `## Reference Library` section listing every file under `doc/references/` as a relative Markdown link, grouped by topic, each with a one-line description of what it covers.
- Add newly ingested books to this section; never duplicate existing entries.

## 7. Expand doc/Study.md

Unlike the reference files, `doc/Study.md` is the user's primary, integrated study document and must stay complete on its own — reference files are the deep-dive backing material, not a replacement.

- For each newly ingested book, fold its most important points into the relevant existing `doc/Study.md` section (matching its existing heading style and structure), with a link to the fuller `doc/references/<Topic>/<slug>.md` file for depth.
- If a topic has no existing section in `doc/Study.md` (e.g. Design Patterns), add one, consistent with the surrounding heading style already used in the file.
- Apply the same acronym-first-use rule within `doc/Study.md` itself, and the same what/why/how, deep-not-verbose, no-cross-source-redundancy, and narrative-form (Section 4a) rules from Section 4 — narrative form applies with full force here, since `doc/Study.md` is the document this criterion exists for.
- **"Concise" is not "shallow" — this is the single most common way this step fails.** A reference file can be genuinely deep while its `doc/Study.md` fold-in is a thin list of concept *names* with a link for "the real detail" — that is a failure, not a legitimate summary. If a reference file explains a mechanism (exact config keys, exact thresholds, exact failure modes, a worked example), the fold-in must carry that same mechanism, just without the reference file's surrounding narration — concise means *no filler around the substance*, never *less substance*. The link to the reference file is for the source's full narrative and lower-priority detail the fold-in deliberately left out, not a substitute for explaining the mechanism at all.
- **Self-check before finishing**: re-read your own `doc/Study.md` additions once, cold. For every new bullet, ask "does this explain the *mechanism* (how it actually works — a config key, an algorithm step, a number), or does it just *name* a concept and point elsewhere?" Any bullet that only names something is not done — either deepen it in place or don't count that concept as covered.
- **Default to append-in-place**, not restructure: when a single book (or a couple) adds a few new points to an already-solid section, add them where they fit and leave the rest alone.
- **Restructure instead when it's warranted**: if several newly-ingested books converge on the same existing section (e.g. multiple books on one technology), read that section as a whole first, then rewrite/reorganize it so the merged result reads as one coherent explanation — not a pile of bullets appended book by book. Preserve every fact and example already present unless a new source shows it's wrong or superseded; reorganize headings/ordering freely to serve clarity. State in the completion summary which sections were restructured versus appended to.

## 8. Run detached

Never do the reading/writing inline in the current conversation — dispatch it via the `Agent` tool with `run_in_background: true` so the user's terminal stays free while it works. **Do not use worktree isolation by default**: an isolated worktree is built from the last commit, so it silently misses any of the user's own uncommitted edits already sitting in `doc/Study.md` — reconciling that divergence afterward has already cost a very expensive 74-conflict manual merge once. Work directly on the real repo files unless there's a specific, stated reason to expect concurrent conflicting edits during this run. Acknowledge immediately that the job has started in the background rather than blocking; when the background agent reports back, summarize what was added (files created, topics touched, anything skipped or unprocessable and why) — then independently verify the actual `doc/Study.md` diff before treating the run as complete, rather than trusting the summary at face value (a past run under-delivered on depth despite reporting success).
