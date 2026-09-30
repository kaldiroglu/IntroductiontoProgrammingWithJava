# Change Log

## 2026-05-04 — Root package renamed: `org.javaturk.ipj` → `dev.kaldiroglu.java.ip`

The root package was renamed to align with the author's personal namespace convention used across the Java course catalogue.

### New namespace shape

```
dev.kaldiroglu.<language>.<courseCode>.<chapter>...
```

For this course: `dev.kaldiroglu.java.ip.chXX.<subpackage>.<Class>`. The trailing `j` in the old `ipj` (Introduction to Programming with **J**ava) was dropped because the language is already encoded by the `.java` segment.

### Companion course on the same convention

The sibling "Object-Oriented Programming with Java" course was renamed `org.javaturk.oopj` → `dev.kaldiroglu.java.oop` on the same day. Future Java courses will follow the same pattern (`dev.kaldiroglu.java.fp` for the FP course, etc.).

### Scope of the change

| What changed | Count / detail |
|---|---|
| Source directory moved | `src/org/javaturk/ipj/` → `src/dev/kaldiroglu/java/ip/` |
| `.java` files: `package` declarations rewritten | 152 of 167 (the 14 unnamed-class / compact source files have no `package` declaration by design — see below) |
| `.java` files: `import` statements rewritten | All intra-course imports |
| Markdown docs updated | `README.md`, `CLAUDE.md` (both `org.javaturk.ipj` and `org/javaturk/ipj` path forms; new "Root package" note added to README) |
| IntelliJ workspace updated | `.idea/workspace.xml` |

### Files deliberately without a `package` declaration

14 files use JEP 512 unnamed-class / compact source file syntax (JDK 21+ preview, finalised in JDK 25) and are intentionally in the unnamed package. The rename pass did **not** add `package` declarations to them — that would defeat the feature being demonstrated.

| Path |
|---|
| `src/dev/kaldiroglu/java/ip/ch01/Selam24.java` |
| `src/dev/kaldiroglu/java/ip/ch01/Selam25.java` |
| `src/dev/kaldiroglu/java/ip/ch01/SystemInfo.java` |
| `src/dev/kaldiroglu/java/ip/ch01/PatternPrinter.java` |
| `src/dev/kaldiroglu/java/ip/ch01/AsciiArtJava.java` |
| `src/dev/kaldiroglu/java/ip/ch04/compact/HelloWorld.java` |
| `src/dev/kaldiroglu/java/ip/ch04/compact/Greeting.java` |
| `src/dev/kaldiroglu/java/ip/ch04/compact/PrintEven.java` |
| `src/dev/kaldiroglu/java/ip/ch04/selam/Selam.java` |
| `src/dev/kaldiroglu/java/ip/ch04/selam/MySelamTest.java` |
| `src/dev/kaldiroglu/java/ip/hw/ch04/MainMethods.java` |
| `src/dev/kaldiroglu/java/ip/hw/ch04/RectangleTest.java` |
| `src/dev/kaldiroglu/java/ip/hw/ch04/name/NameGatherer.java` |
| `src/dev/kaldiroglu/java/ip/hw/ch02/SumCalculator.java` |

One additional file (`src/dev/kaldiroglu/java/ip/ch02/pi/MonteCarloPI.java`) has `package  dev.kaldiroglu.java.ip.ch02.pi;` with two spaces between `package` and the package name. This is a pre-existing whitespace formatting quirk; the rename was applied correctly. No fix required unless the formatting itself bothers you.

### Verification performed

- Pre-flight: `grep -rl 'org\.javaturk' src` reported **159** matches (all `.java` files referencing the old root).
- Post-rewrite: `grep -rl 'org\.javaturk\|org/javaturk' . --include='*.java' --include='*.md' --include='*.xml' --include='*.iml' --exclude-dir=.git` reports **0** matches anywhere in the project (excluding `.git/`).
- `grep -rl '^package dev\.kaldiroglu\.java\.ip' src/` returns **152** of **167** `.java` files (the remaining 15 = 14 unnamed-class files + the 1 double-space-formatted file listed above).
- `grep -rl '^package org\.javaturk\.ipj' src/` returns **0** — the old package declaration is fully eliminated.
- `find src/org -type d` returns nothing — old directory tree gone.

### Note for slides / handouts

Course slides, lecture notes, and student handouts that reference fully-qualified class names (e.g. `org.javaturk.ipj.ch08.Variables`) need to be updated to the new root (`dev.kaldiroglu.java.ip.ch08.Variables`). Chapter numbers, subpackages, and class names are unchanged — only the root differs.
