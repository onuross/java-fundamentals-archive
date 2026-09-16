# ☕ Java Fundamentals, OOP & Data Structures Archive

A modular collection of Object-Oriented Programming (OOP) architectures, custom data structures, and CLI-based simulation systems developed during undergraduate Computer Engineering coursework at **Ege University (2022–2023)** prior to advanced computer science studies at **HTW Dresden**.

## 🎯 Architecture Overview

This monorepo consolidates foundational Java implementations, focusing on custom dynamic data structures (without relying on standard collections), memory management via object references, deep copying techniques, and inheritance patterns.


```
java-fundamentals-archive/
├── data-structures/
│   ├── hash-table/           # Separate chaining hash map with custom linked lists
│   └── number-search/        # Binary vs. Sequential search algorithms with sorting
├── games-and-demos/
│   └── fruit-slot-machine/   # Dynamic CLI simulation with probability-based payouts
└── oop-management-systems/
├── movie-inventory/      # Doubly linked list database engine with file I/O
└── vehicle-management/   # Inheritance trees, polymorphism, and deep copy patterns
```

## 📂 Modules & Technical Specifications

| Module | Category | Core Concepts & Design Patterns |
| :--- | :--- | :--- |
| **`hash-table`** | Data Structures | Custom Hash Table with collision handling via separate chaining, manual `LinkedList` and `DoublyLinkedList` nodes. |
| **`number-search`** | Algorithms | Sequential search vs. Binary search implementation, in-place Bubble Sort, file stream parsing. |
| **`movie-inventory`** | Systems | Custom Doubly Linked List storage engine, insertion sort logic, tokenized text parsing (`Bilgiler.txt`), state persistence. |
| **`vehicle-management`** | OOP Principles | Abstract base classes (`Vehicle`), concrete extensions (`Bus`), Defensive copying (copy constructors), dynamic method dispatch. |
| **`fruit-slot-machine`** | Demos | Flow-control loops, seeded pseudorandom selection, terminal-based financial state tracking. |

## 🛠️ Build & Execution

Prerequisites: **JDK 17+**

Compile and run any module from its respective directory using standard CLI tools:

```bash
# Example: Running the Movie Inventory System
cd oop-management-systems/movie-inventory
javac *.java
java MovieInventoryApp

```

## 📜 License

Distributed under the **MIT License**. See [LICENSE] for full details.



---


2. **Terminali Aç ve Gönder:**
   VS Code terminalinde (`Cmd + ~`) veya Mac Terminal'inde projenin ana klasöründeyken şu komutları sırasıyla çalıştır:

   ```bash
   # 1. Mac sistem dosyası .DS_Store'u engelle
   echo ".DS_Store" > .gitignore

   # 2. Git sistemini başlat
   git init

   # 3. Dosyaları sahnele ve ilk mühürü vur
   git add .
   git commit -m "feat: consolidate introductory Java, OOP, and data structures coursework"

   # 4. Ana dalı main yap
   git branch -M main

   # 5. Yerel depoyu GitHub'a bağla
   git remote add origin https://github.com/onuross/java-fundamentals-archive.git

   # 6. Kodları GitHub'a fırlat
   git push -u origin main

```

## 📜 License
Distributed under the **MIT License**. See the [LICENSE](LICENSE) file for more details.