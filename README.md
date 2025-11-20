# ☕ Core Java for Automation

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Build](https://img.shields.io/badge/build-maven-blue)
![License](https://img.shields.io/badge/license-MIT-green)

## 📖 Overview

Welcome to **Core Java for Automation**! This repository is designed to fast-track the learning curve for QA Engineers, SDETs, and testers who want to master the specific subset of Java required for robust Test Automation (Web, Mobile, and API).

Unlike generic Java courses, this repository cuts out the fluff (like AWT, Swing, or complex Enterprise frameworks) and focuses 100% on the concepts you will actually use when writing scripts in **Selenium**, **Appium**, or **RestAssured**.

---

## 🎯 Why this Repository?

In automation, we don't use *all* of Java. We focus on specific patterns. This repo maps Java concepts directly to Automation use cases:

| Java Concept | Automation Use Case |
| :--- | :--- |
| **Polymorphism** | `WebDriver driver = new ChromeDriver();` |
| **Encapsulation** | Page Object Model (Getters/Setters) |
| **Inheritance** | BaseTest classes and Common Utilities |
| **Collections** | Handling lists of WebElements or Window Handles |
| **Exceptions** | Handling `NoSuchElementException` or `StaleElementReference` |

---

## 📂 Repository Structure

The code is organized by topic complexity, moving from basics to advanced features.

```text
core-java-for-automation/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── com/automation/basics/       # Data types, Loops, Strings
│   │       ├── com/automation/oops/         # Inheritance, Interfaces, Poly
│   │       ├── com/automation/collections/  # List, Set, Map implementations
│   │       ├── com/automation/exceptions/   # Try-catch, Custom Exceptions
│   │       └── com/automation/fileio/       # Reading Properties, Excel, JSON
│   └── test/                                # Unit tests to verify logic
├── resources/                               # Sample config files
├── pom.xml
└── README.md
📚 Topics Covered
1. Java Fundamentals
Variables & Data Types (Primitive vs Non-Primitive)

Operators (Arithmetic, Relational, Logical)

Control Flow (If-else, Switch)

Loops (For, While, Do-While, Enhanced For-Loop)

2. String Manipulation
Crucial for parsing text from UI and API responses.

String methods (substring, contains, replace, split)

StringBuilder vs StringBuffer

3. Object-Oriented Programming (OOPs)
Classes & Objects: The blueprint of automation.

Inheritance: Creating a BaseTest to initialize drivers.

Polymorphism: Overloading (wait methods) and Overriding.

Abstraction: Interfaces (WebDriver) and Abstract Classes.

Encapsulation: Protecting data in Page Object Classes.

4. Java Collections Framework
ArrayList: Storing lists of elements (e.g., dropdown options).

HashSet: Storing unique window handles.

HashMap: Managing Test Data (Key-Value pairs) and JSON parsing.

5. Exception Handling
Checked vs Unchecked Exceptions.

try, catch, finally blocks.

Creating custom exceptions for framework errors.

6. File Handling (I/O)
Reading config.properties files.

Reading/Writing text and CSV files.

7. Modern Java (Java 8+)
Streams API: Filtering lists of WebElements efficiently.

Lambda Expressions: Concise code for functional interfaces.

🛠️ Prerequisites
Before running the code, ensure you have the following installed:

Java Development Kit (JDK) 11 or 17+ - Download Here

IDE (IntelliJ IDEA Community or Eclipse)

Maven (Usually bundled with IDEs)

Git

🚀 Getting Started
Clone the repository:

Bash

git clone [https://github.com/your-username/core-java-for-automation.git](https://github.com/your-username/core-java-for-automation.git)
Open in IntelliJ/Eclipse:

Open your IDE.

Select File -> Open -> Select the cloned folder.

Select Open as Project.

Build the Project:

Navigate to the pom.xml file, right-click, and select Reload Project (IntelliJ) or Update Project (Eclipse) to download dependencies.

Run the Code:

Navigate to any class in src/main/java/..., right-click the file, and select Run 'FileName.main()'.

🤝 Contributing
Contributions are welcome! If you have a good example of a Java concept applied to automation:

Fork the Project.

Create your Feature Branch (git checkout -b feature/NewConcept).

Commit your Changes (git commit -m 'Add Streams Example').

Push to the Branch (git push origin feature/NewConcept).

Open a Pull Request.

📝 License
Distributed under the MIT License. See LICENSE for more information.


### Recommendations for your Repository:

* **Add Practical Comments:** Inside your `.java` files, use comments to explain *why* this code matters for automation.
    * *Example:* `// We use Set here because Window Handles in Selenium are always unique.`
* **Use Unit Tests:** Instead of just `public static void main`, consider using **TestNG** or **JUnit** to run your Java examples. This kills two birds with one stone: teaching Java logic *and* teaching how to run a test.

**Would you like me to write the code for a specific Java class (e.g., a "Collections for Automation" example) to put inside this repo?**
