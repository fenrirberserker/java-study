# Grokking the System Design Interview

Source: Design Gurus / Educative.io, *Grokking the System Design Interview* (163 pages). Sampled: the interview-methodology introduction (pages 1-4), the "System Design Basics" glossary chapter in full (pages 126-163: scalability/reliability/availability, load balancing, caching, sharding, indexes, proxies, replication, Structured Query Language, or SQL, vs. NoSQL, CAP Theorem, consistent hashing, long-polling/WebSockets/Server-Sent Events), and a detailed read of the API rate limiter chapter's sliding-window algorithms (pages 78-83), plus the full table of contents for the 17 worked system-design case studies.

This book has two parts: a **7-step interview framework** plus 17 fully worked system designs (URL shortener, Pastebin, Instagram, Dropbox, Facebook Messenger, Twitter, YouTube/Netflix, Typeahead Suggestion, API Rate Limiter, Twitter Search, Web Crawler, Facebook Newsfeed, Yelp/Nearby Friends, Uber, Ticketmaster), and a **glossary of foundational distributed-systems building blocks** used across all of them. This reference captures the framework and glossary in full (broadly reusable regardless of which specific system is asked about in an interview) plus the rate limiter's specific algorithms (a frequently-asked, algorithmically distinct design problem), and gives the case-study catalog as a table of "which system teaches which distinctive technique" rather than reproducing all 17 designs — the individual designs mostly recombine the same building blocks documented below in different proportions.

## The Seven-Step System Design Interview Framework

1. **Requirements clarification** — system design questions are deliberately open-ended and time-boxed (35-40 minutes); explicitly scoping what's in/out of bounds early (e.g., "are we designing just the backend, or the frontend too? Do we need search? Photos/video?") is framed as the single highest-leverage early move, since candidates who skip it "have a limited chance to get an offer" even with strong technical answers later.
2. **System interface definition** — define the Application Programming Interface (API) surface (e.g., `postTweet(user_id, tweet_data, ...)`, `generateTimeline(user_id, ...)`) before designing internals; this both locks in the contract and surfaces requirement gaps early.
3. **Back-of-the-envelope estimation** — compute expected scale (queries per second, storage growth, bandwidth, cache memory) *before* designing components, since these numbers directly drive later decisions about partitioning, caching, and load balancing (worked in detail in the URL-shortener and rate-limiter examples below).
4. **Data model definition** — identify entities, their relationships, and which storage technology fits (relational vs. NoSQL, block storage for media) before drawing the high-level architecture.
5. **High-level design** — a five-to-six-box block diagram covering the system end-to-end; identify read-heavy vs. write-heavy access patterns early, since that split (e.g., separate read/write server pools) often drives the whole architecture.
6. **Detailed design** — go deep on two or three components based on interviewer signal, always framing choices as **trade-offs** rather than single correct answers (data-partitioning strategy, "hot" user/key handling, cache placement, targeted load balancing).
7. **Bottleneck identification and resolution** — explicitly enumerate single points of failure, replication adequacy, redundancy of services (not just data), and monitoring/alerting coverage.

## System Design Basics (glossary)

### Core Distributed-Systems Characteristics
- **Scalability**: handling growing load by adding resources — *horizontal* (adding more machines) is generally preferred over *vertical* (bigger machines) for very large systems, since vertical scaling has a hard ceiling and a single point of failure.
- **Reliability**: the system keeps working correctly even when components fail — achieved through redundancy (no single point of failure) at both the data and service level.
- **Availability**: the fraction of time the system is operational and able to serve requests, usually expressed in "nines" (99.9%, 99.99%, etc.) — related to but distinct from reliability (a system can be reliable but briefly unavailable during planned maintenance, or available but returning stale/wrong data).
- **Efficiency**: measured via latency (time per request) and throughput (requests handled per unit time).
- **Serviceability/Manageability**: how easily operators can diagnose issues and deploy updates — a characteristic often deprioritized in interviews but explicitly named here as a first-class system quality.

### Load Balancing
Distributes incoming traffic across a pool of servers; benefits include preventing any single server from becoming a bottleneck/single point of failure, and enabling transparent scaling by adding/removing backend servers. Common algorithms: **round robin**, **least connections**, **least response time**, **IP hash** (routes a given client consistently to the same backend, useful for session affinity). **Redundant load balancers** are called out explicitly as necessary — the load balancer itself is a single point of failure unless deployed in an active-passive or active-active pair.

### Caching
- **Application server cache**: an in-process/local cache on each application server — fast, but requires a cache-invalidation strategy across servers if data changes.
- **Content Distribution Network (CDN)**: caches static content geographically close to end users, reducing latency and origin-server load — most effective for read-heavy, rarely-changing content (images, video, static assets).
- **Cache invalidation strategies**: write-through (write to cache and backing store simultaneously — safest, slower writes), write-around (write directly to backing store, bypassing cache — avoids cache pollution from data that may not be re-read soon), write-back (write to cache first, backing store asynchronously later — fastest writes, risk of data loss if the cache fails before flushing).
- **Cache eviction policies**: Least Recently Used (LRU — evict the item not accessed for the longest time; the book's own recommendation for the rate limiter's active-user cache), Least Frequently Used (LFU — evict the item accessed least often overall), First In First Out (FIFO — evict in strict insertion order regardless of access pattern).

### Sharding (Data Partitioning)
- **Partitioning methods**: horizontal (row-based, splitting by a partition key — e.g., by `UserID` range or hash), vertical (splitting by feature/column set — e.g., user profile data on one shard set, user activity data on another), and directory-based (a lookup service mapping keys to shard locations, adding a layer of indirection that makes rebalancing easier at the cost of an extra hop/dependency).
- **Partitioning criteria**: **key/hash-based** (`hash(key) % N`, simple but breaks nearly all mappings when N changes — the direct motivation for consistent hashing, detailed below) versus **list/range-based** (partition by a defined value range — simpler to reason about but prone to uneven load if data isn't uniformly distributed across the range) versus a **consistent-hashing** scheme.
- **Common problems**: **joins and denormalization** become expensive/impossible across shards (often solved by deliberately denormalizing data at write time — the same trade-off documented from the database-index angle in `doc/references/Algorithms & Data Structures/data-structures-and-algorithms-in-java.md`'s B-tree material); **rebalancing** shards as data grows unevenly; and **hotspots** where one shard (e.g., a celebrity user's data) receives disproportionate load, sometimes requiring dedicated infrastructure for outlier keys.

### Indexes
The classic library-card-catalog analogy: an index is a redundant, purpose-built lookup structure that trades additional storage and slower writes for dramatically faster reads on the indexed field(s) — every index must be updated on every write that touches the indexed columns, which is precisely why indexes decrease write performance and why over-indexing a write-heavy table is a real anti-pattern, not just a theoretical concern. Directly complements the B-tree indexing material in `doc/references/Algorithms & Data Structures/data-structures-and-algorithms-in-java.md`.

### Proxies
- **Open (forward) proxy**: sits in front of clients, forwarding client requests outward — used for anonymization, access control (e.g., corporate content filtering), and caching client-side requests.
- **Reverse proxy**: sits in front of servers, accepting client requests on the servers' behalf — used for load balancing, Secure Sockets Layer (SSL) termination, compression, caching, and hiding backend server topology from clients.

### SQL vs. NoSQL — Decision Criteria
Reasons favoring a SQL (relational) database: the data model is genuinely relational and stable, and Atomicity/Consistency/Isolation/Durability (ACID) transactional guarantees matter (e.g., financial data). Reasons favoring NoSQL: data is unstructured or the schema is expected to change frequently; storing huge data volumes; needing very high read/write throughput beyond what a single relational instance/cluster comfortably provides; needing horizontal scalability more than strict relational consistency.

### The CAP Theorem
A distributed system can only guarantee two of Consistency, Availability, and Partition tolerance at once. Since network partitions are a real, unavoidable failure mode in any genuinely distributed system, the practical choice is really between **CP** (consistent, but may refuse to serve requests from an out-of-date partition during a network split) and **AP** (available, but may serve stale data from a partition that hasn't yet received recent updates) — the book's phrasing makes the trade-off concrete: "to be consistent, all nodes should see the same set of updates in the same order... the only thing that can be done [when partitioned] is to stop serving requests from the out-of-date partition, but then the service is no longer 100% available." (Cross-reference: `doc/Study.md` already covers the CAP Theorem and its PACELC extension.)

### Consistent Hashing (worked mechanically)
Motivates the technique by first showing why the naive approach fails: a simple `hash(key) % N` distributed cache breaks almost every key-to-server mapping the instant a server is added or removed (not horizontally scalable to resize) and can produce badly unbalanced load if the underlying data/access pattern isn't uniform. Consistent hashing fixes both:
1. Hash both server identities and keys onto the same fixed circular range (e.g., `[0, 256)`, conceptually a ring).
2. To find a key's owning server, hash the key and walk clockwise around the ring to the first server encountered.
3. **Adding a server** only reassigns the keys between the new server's ring position and the previous server counter-clockwise from it — every other key-to-server mapping is untouched. **Removing a server** only reassigns that server's keys to its clockwise neighbor. In general, resizing from N to N+1 (or N-1) servers only requires remapping roughly `k/N` keys (k = total key count), versus remapping nearly all keys under naive modulo hashing.
4. **Virtual replicas**: to smooth out load imbalance from non-uniform data distribution, each physical server is hashed to *multiple* points on the ring rather than one — increasing replica count improves load balance as long as the underlying hash function mixes well.

This is the standard mechanism behind distributed caches (Memcached client libraries), distributed hash tables, and consistent partition assignment in many NoSQL databases (Cassandra, DynamoDB-style systems) — worth having the ring-walk mechanics memorized precisely, since "explain consistent hashing" is one of the most common standalone system-design interview questions.

### Long-Polling vs. WebSockets vs. Server-Sent Events (SSE)
Four real-time-communication techniques, worth distinguishing precisely by mechanism and directionality:
- **Ajax polling**: client repeatedly re-requests on a fixed interval regardless of whether new data exists — simple, but wastes bandwidth on empty responses and adds latency up to the polling interval.
- **HTTP long-polling** ("hanging GET"): client requests as usual, but the server **holds the request open** without responding until data becomes available (or a timeout fires), then responds and the client immediately re-issues a new long-poll request — reduces empty-response overhead versus plain polling, at the cost of holding open connections server-side.
- **WebSockets**: a genuine full-duplex, persistent Transmission Control Protocol (TCP) connection established via an initial handshake — either side can push data at any time with low per-message overhead; the right choice when the client also needs to send frequent data back to the server (e.g., chat, collaborative editing, gaming).
- **Server-Sent Events (SSE)**: a persistent, but **one-directional** (server-to-client only) connection over regular HTTP — simpler than WebSockets when the client never needs to push data back, well suited to server-driven event streams (live feeds, notifications, progress updates from a long-running server-side loop). If the client also needs to send data, SSE requires pairing with a separate mechanism (e.g., a normal HTTP POST) since SSE itself has no client-to-server channel.

## Rate Limiter Algorithms (worked example, distinct algorithmic content)

The book walks through three progressively refined designs for a per-user API rate limiter, each with an explicit memory-cost calculation — useful as a template for reasoning about any similar "track a bounded recent-activity window per key, cheaply" problem:

1. **Fixed window counter**: increment a counter per user per fixed time bucket (e.g., per minute), reset on bucket boundary. Cheap, but allows burst abuse right at bucket boundaries (e.g., a user could send the full limit at the very end of one window and again at the very start of the next, doubling the effective rate briefly).
2. **Sliding window (exact)**: store every request's timestamp per user (e.g., in a Redis sorted set); on each new request, drop timestamps older than the window, count what remains, reject if over the limit, else insert the new timestamp. Precisely accurate, but memory-expensive: the book's worked estimate for 500 requests/hour per user, tracked exactly, is roughly 12 KB per user — **12 GB total for one million tracked users**.
3. **Sliding window with counters (approximated)**: instead of storing every timestamp, keep a counter per sub-interval (e.g., per minute, for an hourly limit — 1/60th the window granularity) and sum the relevant sub-interval counters on each check. The book's worked estimate for the same 500/hour scenario drops to roughly 1.6 KB per user — **1.6 GB total for one million users, an 86% memory reduction** versus the exact sliding window, at the cost of only approximate (not exact) window boundaries.

Additional practical considerations documented: rate limiting **by IP** is simple but penalizes all users behind a shared IP (e.g., an office network or a carrier-grade NAT gateway) and is vulnerable to IPv6 address-space exhaustion attacks against the limiter's own memory; rate limiting **by authenticated user** avoids that but is vulnerable to a denial-of-service pattern against a single victim account on unauthenticated endpoints like login (an attacker can deliberately trigger the *victim's* rate limit with repeated failed attempts); a **hybrid** (both IP and user) is the practical recommendation, at the cost of roughly double the storage/cache footprint.

## Case-Study Catalog (17 worked designs — index by distinctive technique)

Rather than reproducing all 17 full designs (each recombines the building blocks above), here is what each contributes that's genuinely distinct:

| System | Distinctive technique taught |
|---|---|
| URL Shortener (TinyURL) | Base-62 key encoding vs. offline key-generation service; read-heavy capacity planning walkthrough |
| Pastebin | Near-identical shape to URL shortener but with variable-size content storage (block/object storage vs. metadata database split) |
| Instagram | Fan-out news-feed generation strategies (push/pull/hybrid) under heavy read skew; data sharding for a photo-centric social graph |
| Dropbox | Client-side sync/conflict handling, chunked file upload with deduplication, metadata database separate from block storage |
| Facebook Messenger | Real-time delivery (ties directly to the long-polling/WebSocket/SSE comparison above); online-status/presence management at scale |
| Twitter | Celebrity/hot-user fan-out problem (a user with millions of followers breaks naive "write to every follower's timeline" fan-out) |
| YouTube/Netflix | Video transcoding pipelines, Content Delivery Network (CDN) placement, video deduplication |
| Typeahead Suggestion | Trie-based prefix search with a persistence strategy for the trie itself, plus personalization layering |
| API Rate Limiter | Sliding-window algorithm family (detailed above) |
| Twitter Search | Inverted-index construction and sharding for full-text search over a high-write-volume corpus |
| Web Crawler | Breadth-first crawl frontier management, URL-seen deduplication at scale, crawler-trap avoidance |
| Facebook Newsfeed | Feed ranking as a distinct concern from feed generation/storage |
| Yelp/Nearby Friends | Geospatial indexing via grids of dynamically adjustable size (denser grid cells in dense areas) as an alternative to naive SQL radius queries |
| Uber Backend | Real-time location matching combining geospatial indexing with dispatch/ranking logic |
| Ticketmaster | Concurrency control for high-contention resource booking (seat reservation) — a distinct problem class from the mostly read-heavy systems elsewhere in the catalog |

## Takeaways for a Senior Backend Java Developer

- Consistent hashing's ring-walk mechanism and the "why does naive `hash % N` fail" motivation are worth having memorized precisely — a very common standalone interview question independent of any specific system design.
- The three-tier rate-limiter algorithm progression (fixed window -> exact sliding window -> sliding window with counters) is a reusable pattern for any "bounded recent history per key, at scale" problem, not just API throttling — the same memory/accuracy trade-off applies to things like recent-activity feeds or abuse-detection windows.
- The seven-step framework's ordering (requirements -> interface -> estimation -> data model -> high-level -> detailed -> bottlenecks) is worth adopting verbatim as a default structure for any open-ended design discussion, interview or otherwise, since it front-loads the scoping conversation that most engineers skip under time pressure.
- The IP-vs-user-vs-hybrid rate-limiting trade-off (and the specific "attacker locks out a victim via their own auth-failure rate limit" vulnerability) is a concrete, non-obvious security consideration worth citing directly when reviewing any authentication-adjacent rate-limiting design.
