# 🤖 AI

> ⬆️ Main entry: [Study](Study.md)

*Outline to be filled as the study progresses — the structure below marks the topics that matter for a backend developer integrating artificial intelligence into services.*

---

## 📑 Index

- [Large Language Model Fundamentals](#large-language-model-fundamentals)
- [Prompt Engineering](#prompt-engineering)
- [Retrieval-Augmented Generation (RAG)](#retrieval-augmented-generation-rag)
- [Agents & Tool Use](#agents--tool-use)
- [Java Ecosystem](#java-ecosystem)
- [Evaluation & Safety](#evaluation--safety)

---

## Large Language Model Fundamentals
- **Tokens**: The unit models read and produce; pricing and limits are counted in tokens
- **Context window**: The maximum amount of tokens a model can consider at once
- **Temperature and sampling**: Controls randomness — low for deterministic answers, higher for creative output
- Pre-training vs fine-tuning vs in-context learning (examples inside the prompt)

## Prompt Engineering
- System prompt vs user prompt; role separation
- Few-shot examples; structured (JSON) outputs
- Why clear, explicit instructions beat clever tricks

## Retrieval-Augmented Generation (RAG)
- **Embeddings**: Text converted to vectors capturing meaning
- **Vector databases**: Similarity search over embeddings (pgvector, Pinecone, and similar)
- Chunking strategies and their effect on retrieval quality
- The pipeline: ingest → embed → store → retrieve → inject into the prompt

## Agents & Tool Use
- The tool-use loop: the model requests a tool call, the application executes it, the result feeds back into the model
- **Model Context Protocol (MCP)**: Open standard for exposing utils and data sources to models
- Orchestration patterns: single agent vs planner plus workers

## Java Ecosystem
- **Spring AI**: Spring Boot starters for calling model providers, embeddings and vector stores
- **LangChain4j**: Java library for chains, memory, tool use and Retrieval-Augmented Generation

## Evaluation & Safety
- Hallucinations and grounding; when to force the model to cite retrieved sources
- Evaluation sets and regression testing for prompts
- Guardrails: input validation, output filtering, human approval for sensitive actions
