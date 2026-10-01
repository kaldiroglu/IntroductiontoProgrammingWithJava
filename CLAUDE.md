# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this is

A teaching codebase for **Introduction to Programming with Java** (Turkish: *Java ile Programlamaya Giriş*) by **Akin Kaldiroglu**. 167 `.java` files distributed across 11 numbered chapters plus auxiliary packages. The audience is **first-time programmers**, not professional developers — examples are deliberately small, focused on one concept each, and meant to be run individually as classroom demonstrations.

The course README is bilingual (Turkish + English). Class names and identifiers mix English with Turkish (e.g. `Selam` = "Hello", `Sayı` = "number"). Comments and string literals are often Turkish.

## Layout and toolchain

- Flat IntelliJ `src/` directory (no Maven, no Gradle, no test framework). Open in IntelliJ IDEA.
- JDK 25 with **preview features enabled** (per `.idea/misc.xml`: `languageLevel="JDK_25_PREVIEW"`). Some examples may use preview-only syntax.
- All source under `src/dev/kaldiroglu/java/ip/...`. The root was renamed from `org.javaturk.ipj` on 2026-05-04 — see the "Root package" note below.
- "Tests" are `main` methods that print to stdout. Run a class from IntelliJ's gutter; read its output. There are no JUnit assertions and no automated test runner.

## Package layout — what each top-level package is for

| Package | Purpose |
|---|---|
| `ch01` – `ch11` | Chapter material, one OOP/programming concept per chapter (see README for the syllabus). Larger chapters (`ch10`, `ch06`, `ch09`, `ch04`) further subdivide by sub-concept (e.g. `ch10/loop`, `ch10/recursion`, `ch10/decision/{ifElse, switchCase}`). |
| `ex` | Helper / supporting classes that some chapter exercises depend on. |
| `hw` | **Homework** assignments, organised by chapter (`hw/ch02`, `hw/ch03`, `hw/ch04`, `hw/ch08`, `hw/ch10`). Often skeleton code to be completed by students. |
| `solution` | **Worked solutions** for selected chapters (currently `solution/ch10`, `solution/ch11`). Treat as reference, not as classroom-facing code. |
| `project/solution` | The **course capstone project** — `Queue` and `Stack` implementations plus realistic applications (`PrintManager` using a queue, `Linter` using a stack). |
| `game/numberGuessing` | The **Number Guessing Game** capstone exercise. Contains both Turkish and English prompt files (`Number Guessing Game Prompt.txt`, `Sayı Tahmin Oyunu Promptu.txt`) and three subfolders — `claude/`, `copilot/`, `gemini/` — comparing how each LLM solves the same prompt. When editing here, respect the per-LLM directory boundary; do not cross-pollinate solutions between subfolders. |

## File / class naming

This codebase already follows a consistent rule — preserve it. The default is **bare noun**; suffixes are added only to disambiguate.

| Situation | Form | Examples |
|---|---|---|
| Domain class defined for reuse elsewhere | `<Type>.java` | `Car`, `Rectangle`, `Queue`, `FootballPlayer` |
| Driver that exercises a domain class | `<Type>Test.java` (suffix form, never prefix) | `CarTest`, `RectangleTest`, `QueueTest`, `LinterTest` |
| Topic-as-class-name when the topic doesn't collide with a Java keyword | `<Topic>.java` | `Booleans`, `Variables`, `BinaryPromotion`, `Comments`, `Operators` |
| Topic name collides with a Java keyword or common identifier | `<Topic>Demo.java` | `WhileDemo`, `ForDemo`, `DoWhileDemo`, `IfElseDemo`, `ReturnDemo`, `VarDemo`, `ArrayDemo`, `TernaryOperatorDemo` |

**Do not introduce `*Example.java` — there are zero files using that suffix and adding it would create a third bucket without a clear rule.** Use `*Demo` only for the keyword-collision case described above.

The one file `studentInfo.java` (lowercase first letter) is **deliberately wrong** as a teaching example of naming-convention violation — see `hw/ch02/studentInfo.java` and `ch03/NamingProblems.java`. Do not "fix" it.

## Pedagogical conventions to recognise

- **Numbered/iteration variants**: Files like `Selam.java`, `Selam24.java`, `Selam25.java` (in `ch01`) are deliberate progressions showing the same example evolving across language versions or refinements. Open them in order — only one thing changes per step.
- **Commented-out code is often the lesson**: lines that look like dead code may be *intentionally invalid code preserved as compile-error demonstrations*. Before deleting any commented block, check whether it is teaching the constraint that prevents it from compiling.
- **Antipatterns**: Some files (e.g. naming-problem demos) deliberately violate Java conventions to give students a "before" picture. These should not be silently corrected.

## Root package (renamed 2026-05-04)

The author maintains a personal namespace standard `dev.kaldiroglu.<language>.<courseCode>` across multiple Java courses. On 2026-05-04 this course was renamed:

```
org.javaturk.ipj  →  dev.kaldiroglu.java.ip
```

The trailing `j` in `ipj` was dropped because the language is already encoded by the `.java` segment. The sibling OOP course was renamed to `dev.kaldiroglu.java.oop` on the same day under the same convention.

**Files that legitimately have no `package` declaration**: 14 files under `ch01/`, `ch04/compact/`, `ch04/selam/`, and a few `hw/ch04/` files use JEP 512 unnamed-class / compact source file syntax (JDK 21+ preview, finalised in JDK 25). They live in the unnamed package by design — do not add `package` declarations to them.

## When in doubt

- Don't introduce new packages or break the chapter-numbered layout.
- Don't add a build file (Maven/Gradle), JUnit, or any test runner without an explicit ask — the flat-`src` IDE-driven layout is intentional for classroom use.
- Don't rename files that students may have bookmarked, opened in slides, or referenced in homework instructions, without confirmation. Class names are part of the published course identity.
