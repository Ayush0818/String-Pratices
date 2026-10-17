# 🧵 String Manipulation Practice in Java

[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-green?style=for-the-badge)](https://github.com/)
[![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)](https://github.com/)

An interactive, question-based repository dedicated to mastering core Java string concepts: character iteration, ASCII encoding arithmetic, alphabetical position mapping, and symmetric two-pointer string rearrangements.

---

## 📋 Table of Contents

- [📌 Practice Track Overview](#-practice-track-overview)
- [🧩 Problem Statements & Deep Dive](#-problem-statements--deep-dive)
  - [1️⃣ Program 1: Uppercase & ASCII Code Extractor](#1️⃣-program-1-uppercase--ascii-code-extractor)
  - [2️⃣ Program 2: 1-Based Alphabetical Position Finder](#2️⃣-program-2-1-based-alphabetical-position-finder)
  - [3️⃣ Program 3: Front-and-Back (Outside-In) Rearrangement](#3️⃣-program-3-front-and-back-outside-in-rearrangement)
- [📊 At-a-Glance Program Comparison](#-at-a-glance-program-comparison)
- [🚀 Quick Start & Execution Guide](#-quick-start--execution-guide)
- [💡 Pro Coding Insights & Optimizations](#-pro-coding-insights--optimizations)

---

## 📌 Practice Track Overview

- [x] **Program 1:** Traverse characters, normalize to uppercase, and display ASCII codes.
- [x] **Program 2:** Map characters to their 1-based alphabetic positions ($A=1, B=2, \dots, Z=26$).
- [x] **Program 3:** Reorganize strings symmetrically by alternating front and rear characters inward.

---

## 🧩 Problem Statements & Deep Dive

### 1️⃣ Program 1: Uppercase & ASCII Code Extractor

#### ❓ Problem Statement (Question)
> **Problem 1:**  
> Write a Java program that takes an input string, converts each character into uppercase, and outputs each character alongside its corresponding numerical ASCII code.

#### 🎯 Learning Objectives
- Understanding string traversal with loop indices.
- Uppercase normalization using `toUpperCase()`.
- Performing explicit type casting from `char` to `int` to extract character encodings.

#### 📥 Input & 📤 Output Specification
- **Test Input:** `"Hello"`
- **Expected Console Output:**
  - Character: `H` $\rightarrow$ ASCII Code: `72`
  - Character: `E` $\rightarrow$ ASCII Code: `69`
  - Character: `L` $\rightarrow$ ASCII Code: `76`
  - Character: `L` $\rightarrow$ ASCII Code: `76`
  - Character: `O` $\rightarrow$ ASCII Code: `79`

#### 🔍 Execution Logic in 3 Steps
1. **Loop through string:** Iterate from index `0` up to `str.length() - 1`.
2. **Convert & Cast:** Isolate character at each index in uppercase, then cast `(int) character`.
3. **Display:** Print the character label and its computed numeric ASCII code on separate lines.

<details>
<summary><b>📂 Click to view file details & tips</b></summary>

- **Source File:** [`src/Program1.java`](src/Program1.java)
- **Time Complexity:** $\mathcal{O}(n)$
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary
- **Quick Tip:** ASCII values for uppercase letters `'A'` through `'Z'` always fall within the range `[65, 90]`.
</details>

---

### 2️⃣ Program 2: 1-Based Alphabetical Position Finder

#### ❓ Problem Statement (Question)
> **Problem 2:**  
> Write a Java program that takes a string, normalizes each character to uppercase, and determines its 1-based position in the English alphabet (where `'A' = 1`, `'B' = 2`, ..., `'Z' = 26`) using direct ASCII offset arithmetic.

#### 🎯 Learning Objectives
- Converting characters into relative alphabetical indices.
- Eliminating hardcoded mapping tables using simple arithmetic.
- Applying numerical offsets to character encodings.

#### 📥 Input & 📤 Output Specification
- **Test Input:** `"Hello"`
- **Expected Console Output:**
  - Character: `H` $\rightarrow$ Alphabetical Order: `8`
  - Character: `E` $\rightarrow$ Alphabetical Order: `5`
  - Character: `L` $\rightarrow$ Alphabetical Order: `12`
  - Character: `L` $\rightarrow$ Alphabetical Order: `12`
  - Character: `O` $\rightarrow$ Alphabetical Order: `15`

#### 🔍 Execution Logic in 3 Steps
1. **Fetch ASCII:** Obtain the integer ASCII value of the uppercase character.
2. **Apply Offset Formula:**
   $$\text{Alphabetical Order} = \text{ASCII Value} - 64$$
   *(Since `'A'` is $65$, $65 - 64 = 1$; `'Z'` is $90$, $90 - 64 = 26$)*.
3. **Display:** Print the uppercase character along with its 1-based rank.

<details>
<summary><b>📂 Click to view file details & tips</b></summary>

- **Source File:** [`src/Program2.java`](src/Program2.java)
- **Time Complexity:** $\mathcal{O}(n)$
- **Alternative Implementation:** You can also use `ch - 'A' + 1` directly without memorizing the number $64$.
</details>

---

### 3️⃣ Program 3: Front-and-Back (Outside-In) Rearrangement

#### ❓ Problem Statement (Question)
> **Problem 3:**  
> Write a Java program to rearrange an uppercase version of a string by alternating characters inward from both ends (1st character, then last character, 2nd character, then 2nd-to-last character, and so on). If the string has an odd length, append the solitary middle character at the very end.

#### 🎯 Learning Objectives
- Two-pointer symmetric indexing (`i` from start, `n - 1 - i` from end).
- Loop termination at midpoint (`length / 2`).
- Odd/even parity handling using modulo operator (`% 2 != 0`).
- Progressive string concatenation.

#### 📥 Input & 📤 Output Specification
- **Test Input:** `"Hello"` (Length = 5, Odd)
- **Rearrangement Process:**
  - Pair 1 ($i = 0$): 1st character `'H'` + 5th character `'O'` $\rightarrow$ `"HO"`
  - Pair 2 ($i = 1$): 2nd character `'E'` + 4th character `'L'` $\rightarrow$ `"HOEL"`
  - Center Character ($i = 2$): Unpaired middle character `'L'` $\rightarrow$ `"HOELL"`
- **Final Output:** `"HOELL"`

#### 🔍 Execution Logic in 4 Steps
1. **Calculate Midpoint:** Loop runs for `i = 0` to `i < str.length() / 2`.
2. **Pair Symmetric Ends:** In each iteration, take character at index `i` and character at index `str.length() - 1 - i`.
3. **Handle Odd Parity:** If `str.length() % 2 != 0`, append the character at index `str.length() / 2`.
4. **Output Result:** Display original string vs. the newly arranged string.

<details>
<summary><b>📂 Click to view file details & visual trace</b></summary>

- **Source File:** [`src/Program3.java`](src/Program3.java)
- **Trace for `"Java"` (Even Length = 4):**
  - Iteration 0: `'J'` + `'A'` $\rightarrow$ `"JA"`
  - Iteration 1: `'A'` + `'V'` $\rightarrow$ `"JAAV"`
  - Result: `"JAAV"`
- **Time Complexity:** $\mathcal{O}(n)$
- **Space Complexity:** $\mathcal{O}(n)$ to store resulting string
</details>

---

## 📊 At-a-Glance Program Comparison

| Metric | Program 1 | Program 2 | Program 3 |
| :--- | :--- | :--- | :--- |
| **File** | [`Program1.java`](src/Program1.java) | [`Program2.java`](src/Program2.java) | [`Program3.java`](src/Program3.java) |
| **Primary Goal** | ASCII Value Extraction | Alphabet Rank Calculation | Symmetric Character Interleaving |
| **Core Concept** | Type casting `(int) char` | Offset math (`ASCII - 64`) | Two-pointer pairing (`i` & `n-1-i`) |
| **Input** | `"Hello"` | `"Hello"` | `"Hello"` |
| **Output** | `H: 72`, `E: 69`, `L: 76`... | `H: 8`, `E: 5`, `L: 12`... | `"HOELL"` |
| **Parity Check Needed?** | ❌ No | ❌ No | ✅ Yes (for middle character) |

---

## 🚀 Quick Start & Execution Guide

### 🛠 Prerequisites
- Java Development Kit (JDK 8 or higher)

### 💻 Running the Programs

- **Step 1:** Open your terminal or command prompt.
- **Step 2:** Navigate to the `src` directory:
  ```bash
  cd String-Pratice/src
  ```
- **Step 3:** Run whichever program you wish to test:
  - Run Program 1:
    ```bash
    java Program1.java
    ```
  - Run Program 2:
    ```bash
    java Program2.java
    ```
  - Run Program 3:
    ```bash
    java Program3.java
    ```

---

## 💡 Pro Coding Insights & Optimizations

- 🔹 **Hoist `toUpperCase()` outside the loop:**
  Calling `str.toUpperCase()` inside a loop recreates an uppercase string every single iteration. Converting once prior to the loop improves efficiency from $\mathcal{O}(n^2)$ to $\mathcal{O}(n)$.
- 🔹 **Prefer `StringBuilder` over `+` concatenation:**
  In Program 3, repeatedly appending characters with `+` creates multiple intermediate immutable `String` objects in memory. Using `StringBuilder` optimizes heap memory allocation.
- 🔹 **Self-Documenting Character Arithmetic:**
  Instead of subtracting magic number `64`, using `ch - 'A' + 1` makes the intent immediately clear to anyone reading your code.

---

## 📜 License & Usage
This repository is created for educational and practice purposes. Feel free to clone, star ⭐, and adapt the problems for learning and teaching!
