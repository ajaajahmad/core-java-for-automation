# ☕ Core Java for Automation

<div align="center">

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

### 🚀 Fast-track Your Journey from Manual Tester to Automation Engineer

*Learn ONLY the Java you need for Test Automation - No Fluff, Just Real-World Skills*

[📖 Documentation](#-topics-covered) • [🎯 Getting Started](#-getting-started) • [💡 Examples](#-learning-path) • [🤝 Contribute](#-contributing)

</div>

---

## 📖 Overview

Welcome to **Core Java for Automation**! This repository is your express lane to mastering Java for Test Automation. Whether you're working with **Selenium WebDriver**, **Appium**, **RestAssured**, or **Playwright**, this repo teaches you the exact Java concepts you'll use daily.

### 🎯 What Makes This Different?

| ❌ Traditional Java Courses | ✅ This Repository |
|:---------------------------|:-------------------|
| Covers GUI (AWT, Swing) | **Focuses on Automation Patterns** |
| Generic programming examples | **Real Selenium/Appium scenarios** |
| 500+ hours of content | **Targeted 40-hour learning path** |
| Theory-heavy | **Code-first approach with comments** |

---

## 🎪 Java Concepts → Automation Mapping

See how Java powers your automation framework:

```
┌─────────────────────────────────────────────────────────────────┐
│                    AUTOMATION FRAMEWORK                         │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│  📦 Polymorphism                                                │
│     WebDriver driver = new ChromeDriver();  ← Interface-based   │
│                                                                 │
│  🔐 Encapsulation                                               │
│     private WebElement loginBtn;           ← Page Object Model  │
│     public void clickLogin() {...}                              │
│                                                                 │
│  🧬 Inheritance                                                 │
│     BaseTest ← LoginTest ← CheckoutTest    ← Reusable setup     │
│                                                                 │
│  📚 Collections                                                 │
│     List<WebElement> links = driver.findElements(...);          │
│     Map<String, String> testData = readExcel();                 │
│                                                                 │
│  ⚠️ Exception Handling                                          │
│     try { element.click(); }                                    │
│     catch (StaleElementReferenceException e) {...}              │
│                                                                 │
│  🌊 Streams (Java 8+)                                           │
│     driver.findElements(By.tagName("a"))                        │
│           .stream().filter(e -> e.isDisplayed())                │
│           .forEach(e -> System.out.println(e.getText()));       │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

---

## 📂 Repository Structure

```
core-java-for-automation/
│
├── 📁 src/main/java/com/automation/
│   │
│   ├── 📂 basics/
│   │   ├── DataTypesDemo.java              # Primitives vs Objects
│   │   ├── OperatorsExample.java           # Conditional checks in tests
│   │   ├── LoopsDemo.java                  # Iterating WebElements
│   │   └── StringManipulation.java         # Parsing UI text & JSON
│   │
│   ├── 📂 oops/
│   │   ├── InheritanceExample.java         # BaseTest pattern
│   │   ├── PolymorphismDemo.java           # WebDriver = ChromeDriver
│   │   ├── EncapsulationPOM.java           # Page Object Model
│   │   └── AbstractionDemo.java            # Interfaces & Abstract classes
│   │
│   ├── 📂 collections/
│   │   ├── ArrayListExample.java           # Storing dropdown options
│   │   ├── HashSetExample.java             # Unique window handles
│   │   ├── HashMapExample.java             # Test data management
│   │   └── StreamsFilterDemo.java          # Java 8 filtering elements
│   │
│   ├── 📂 exceptions/
│   │   ├── TryCatchExample.java            # Handling Selenium exceptions
│   │   ├── CustomExceptions.java           # Framework-specific errors
│   │   └── BestPractices.java              # Exception handling patterns
│   │
│   └── 📂 fileio/
│       ├── ReadPropertiesFile.java         # Config management
│       ├── ReadExcelData.java              # Data-driven testing
│       └── ReadJSONFile.java               # API test data
│
├── 📁 src/test/java/                        # Unit tests for each concept
├── 📁 resources/
│   ├── config.properties                    # Sample configuration
│   ├── testdata.xlsx                        # Excel test data
│   └── users.json                           # JSON test data
│
├── pom.xml                                  # Maven dependencies
├── README.md                                # You are here!
└── LICENSE
```

---

## 📚 Topics Covered

### 🔷 Module 1: Java Fundamentals
<details>
<summary>Click to expand</summary>

#### ✅ Variables & Data Types
```java
// Why it matters: Selenium returns different data types
int timeout = 10;                    // Implicit wait duration
String pageTitle = driver.getTitle(); // Text data from UI
boolean isDisplayed = element.isDisplayed(); // Validation flags
```

#### ✅ Control Flow & Loops
```java
// Real automation scenario: Verify all links on a page
List<WebElement> links = driver.findElements(By.tagName("a"));
for (WebElement link : links) {
    if (link.isDisplayed()) {
        System.out.println(link.getText());
    }
}
```

</details>

---

### 🔷 Module 2: String Manipulation
<details>
<summary>Click to expand</summary>

Strings are everywhere in automation: URLs, XPaths, test data, API responses.

```java
// Parsing dynamic XPaths
String dynamicXPath = "//div[text()='" + username + "']";

// Validating text from UI
String actualText = element.getText().trim().toLowerCase();
assertTrue(actualText.contains("welcome"));

// StringBuilder for efficient concatenation
StringBuilder xpath = new StringBuilder("//input[@id='");
xpath.append(fieldName).append("']");
```

**Key Methods:** `substring()`, `split()`, `replace()`, `contains()`, `trim()`, `toLowerCase()`

</details>

---

### 🔷 Module 3: Object-Oriented Programming (OOPs)
<details>
<summary>Click to expand</summary>

#### 🎯 Classes & Objects
```java
// Page Object Model pattern
public class LoginPage {
    WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}
```

#### 🎯 Inheritance
```java
// BaseTest class - Initialize driver once
public class BaseTest {
    protected WebDriver driver;
    
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }
}

public class LoginTest extends BaseTest {
    // Inherits driver from BaseTest
}
```

#### 🎯 Polymorphism
```java
// Method Overloading: Multiple wait strategies
public void waitForElement(By locator) { }
public void waitForElement(By locator, int timeout) { }

// Method Overriding: Custom click behavior
@Override
public void click() {
    waitForElement();
    super.click();
}
```

#### 🎯 Abstraction
```java
// WebDriver is an Interface (100% abstraction)
WebDriver driver = new ChromeDriver(); // Can switch to FirefoxDriver
```

#### 🎯 Encapsulation
```java
// Protecting WebElements in Page Objects
public class LoginPage {
    @FindBy(id = "username")
    private WebElement usernameField; // Private access
    
    public void enterUsername(String username) { // Public method
        usernameField.sendKeys(username);
    }
}
```

</details>

---

### 🔷 Module 4: Collections Framework
<details>
<summary>Click to expand</summary>

| Collection Type | Automation Use Case | Example |
|:----------------|:--------------------|:--------|
| **ArrayList** | Store lists of WebElements | Dropdown options, table rows |
| **HashSet** | Store unique items | Window handles, unique test IDs |
| **HashMap** | Key-Value pairs | Test data, config properties |
| **LinkedHashMap** | Maintain insertion order | Ordered test execution data |

```java
// ArrayList: Storing all dropdown options
List<WebElement> options = driver.findElements(By.tagName("option"));
List<String> optionTexts = new ArrayList<>();
for (WebElement option : options) {
    optionTexts.add(option.getText());
}

// HashSet: Managing window handles (always unique)
Set<String> windowHandles = driver.getWindowHandles();

// HashMap: Test Data Management
Map<String, String> testData = new HashMap<>();
testData.put("username", "admin@test.com");
testData.put("password", "Test@123");
```

</details>

---

### 🔷 Module 5: Exception Handling
<details>
<summary>Click to expand</summary>

#### Common Selenium Exceptions You'll Handle:
- `NoSuchElementException` → Element not found
- `StaleElementReferenceException` → Element changed in DOM
- `TimeoutException` → Wait condition not met
- `ElementNotInteractableException` → Element not clickable

```java
// Robust click method with exception handling
public void safeClick(WebElement element) {
    try {
        element.click();
    } catch (StaleElementReferenceException e) {
        // Re-locate element and retry
        element = driver.findElement(By.id("elementId"));
        element.click();
    } catch (ElementNotInteractableException e) {
        // Use JavaScript click as fallback
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}
```

</details>

---

### 🔷 Module 6: File Handling (I/O)
<details>
<summary>Click to expand</summary>

Essential for:
- Reading `config.properties` (URLs, credentials)
- Excel files for data-driven testing
- JSON files for API test data

```java
// Reading Properties file
Properties config = new Properties();
FileInputStream fis = new FileInputStream("config.properties");
config.load(fis);
String url = config.getProperty("app.url");

// Reading Excel (using Apache POI)
FileInputStream excelFile = new FileInputStream("testdata.xlsx");
Workbook workbook = new XSSFWorkbook(excelFile);
Sheet sheet = workbook.getSheetAt(0);
String username = sheet.getRow(1).getCell(0).getStringCellValue();
```

</details>

---

### 🔷 Module 7: Modern Java (Java 8+)
<details>
<summary>Click to expand</summary>

#### Lambda Expressions
```java
// Before Java 8
List<WebElement> links = driver.findElements(By.tagName("a"));
for (WebElement link : links) {
    System.out.println(link.getText());
}

// With Lambda
links.forEach(link -> System.out.println(link.getText()));
```

#### Streams API
```java
// Filter only displayed links
List<WebElement> displayedLinks = driver.findElements(By.tagName("a"))
    .stream()
    .filter(WebElement::isDisplayed)
    .collect(Collectors.toList());

// Get all link texts in uppercase
List<String> linkTexts = links.stream()
    .map(WebElement::getText)
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

</details>

---

## 🛠️ Prerequisites

Before you begin, ensure you have:

| Tool | Version | Download Link |
|:-----|:--------|:--------------|
| ☕ **Java JDK** | 11 or 17+ | [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://adoptium.net/) |
| 🔧 **Maven** | 3.6+ | [Download Maven](https://maven.apache.org/download.cgi) |
| 💻 **IDE** | Latest | [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) or [Eclipse](https://www.eclipse.org/downloads/) |
| 📦 **Git** | Latest | [Download Git](https://git-scm.com/downloads) |

### ✅ Verify Installation

```bash
# Check Java version
java -version

# Check Maven version
mvn -version

# Check Git version
git --version
```

---

## 🚀 Getting Started

### Step 1: Clone the Repository

```bash
git clone https://github.com/your-username/core-java-for-automation.git
cd core-java-for-automation
```

### Step 2: Open in Your IDE

**IntelliJ IDEA:**
1. Open IntelliJ IDEA
2. `File` → `Open` → Select the `core-java-for-automation` folder
3. Wait for Maven to download dependencies

**Eclipse:**
1. Open Eclipse
2. `File` → `Import` → `Existing Maven Projects`
3. Browse to the cloned folder → `Finish`

### Step 3: Build the Project

```bash
# From terminal/command prompt
mvn clean install
```

### Step 4: Run Your First Example

1. Navigate to `src/main/java/com/automation/basics/DataTypesDemo.java`
2. Right-click → `Run 'DataTypesDemo.main()'`
3. Check console output! 🎉

---

## 💡 Learning Path

Follow this sequence for optimal learning:

```
Week 1: Basics
  ├─ Day 1-2: Variables, Data Types, Operators
  ├─ Day 3-4: Control Flow & Loops
  └─ Day 5-7: String Manipulation

Week 2: OOPs
  ├─ Day 8-9: Classes, Objects, Methods
  ├─ Day 10-11: Inheritance & Polymorphism
  └─ Day 12-14: Abstraction & Encapsulation

Week 3: Collections & Exceptions
  ├─ Day 15-17: ArrayList, HashSet, HashMap
  └─ Day 18-21: Exception Handling Patterns

Week 4: Advanced Concepts
  ├─ Day 22-24: File I/O Operations
  └─ Day 25-28: Streams, Lambda Expressions

🎯 Total Duration: 28 Days (1 hour/day)
```

---

## 🎓 Practical Exercises

Each module includes:

- ✅ **Commented Code Examples** - Understand *why* this matters for automation
- ✅ **Real Selenium Scenarios** - See Java concepts in action
- ✅ **Practice Challenges** - Reinforce your learning
- ✅ **Mini Projects** - Build actual automation utilities

### 🏆 Example Mini Projects

1. **Config Reader Utility** - Read properties file for test configuration
2. **Excel Data Provider** - Build data-driven test framework
3. **Custom Wait Utility** - Implement smart waits using Java concepts
4. **Page Object Generator** - Auto-generate POM classes

---

## 🤝 Contributing

We welcome contributions! Here's how:

1. **Fork** this repository
2. Create a **feature branch** (`git checkout -b feature/StreamsExample`)
3. **Commit** your changes (`git commit -m 'Add Streams filtering example'`)
4. **Push** to the branch (`git push origin feature/StreamsExample`)
5. Open a **Pull Request**

### 📝 Contribution Guidelines

- Add comments explaining *why* this concept matters for automation
- Include real Selenium/Appium examples where possible
- Follow existing code structure and naming conventions
- Update README if adding new topics

---

## 📖 Additional Resources

- 📘 [Selenium Documentation](https://www.selenium.dev/documentation/)
- 📙 [Java 17 API Docs](https://docs.oracle.com/en/java/javase/17/docs/api/)
- 📗 [TestNG Framework](https://testng.org/doc/documentation-main.html)
- 📕 [RestAssured Docs](https://rest-assured.io/)

---

## 📝 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 🌟 Star This Repo!

If this repository helped you, please ⭐ **star it** to show your support and help others discover it!

---

<div align="center">

### 💬 Questions or Feedback?

Open an [Issue](https://github.com/your-username/core-java-for-automation/issues) or start a [Discussion](https://github.com/your-username/core-java-for-automation/discussions)

**Happy Automating! 🚀**

</div>
