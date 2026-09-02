# Selenium Automation Testing – The Internet (Herokuapp)

## 📌 Project Overview

This project is a UI automation testing framework developed for
The Internet (Herokuapp) website.

The project automates different web testing scenarios using Selenium
WebDriver with Java and TestNG while following the Page Object Model (POM)
design pattern.

The purpose of this project is to practice and demonstrate automation
testing concepts such as element interaction, synchronization, browser
handling, alerts, frames, windows, dynamic content, file operations,
authentication, and other common web testing scenarios.

---

## 🛠 Technologies & Tools

- Java
- Selenium WebDriver
- TestNG
- Maven
- Allure Reports
- Page Object Model (POM)
- ChromeDriver
- Git & GitHub
- IntelliJ IDEA

---

## 🏗 Framework Structure

The project follows the Page Object Model (POM) design pattern.

Each tested page has its own Page Object class containing:

- Element locators
- WebElement methods
- Page actions
- Page validation methods
- Explicit waits

Test classes contain the test scenarios and assertions while keeping
page interaction logic inside the Page Object classes.

Example structure:

src
├── main
│   └── java
│       ├── Base
│       ├── Pages
│       └── Utilities
│
└── test
    ├── java
    │   └── Tests
    └── resources

---

## 🧪 Automated Test Scenarios

The project covers a wide range of web automation scenarios, including:

- A/B Testing
- Add/Remove Elements
- Basic Authentication
- Broken Images
- Challenging DOM
- Checkboxes
- Context Menu
- Digest Authentication
- Disappearing Elements
- Drag and Drop
- Dropdown Lists
- Dynamic Content
- Dynamic Controls
- Dynamic Loading
- Entry Ad
- Exit Intent
- File Download
- File Upload
- Floating Menu
- Forgot Password
- Form Authentication
- Frames and iFrames
- Geolocation
- Horizontal Slider
- Hover Actions
- Infinite Scroll
- Input Fields
- JQuery UI Menu
- JavaScript Alerts
- JavaScript Errors
- Key Presses
- Large & Deep DOM
- Multiple Windows
- Nested Frames
- Notification Messages
- Redirect Links
- Secure File Download
- Shadow DOM
- Shifting Content
- Slow Resources
- Sortable Data Tables
- Status Codes
- Typos
- WYSIWYG Editor

---

## 🔍 Testing Techniques Demonstrated

The framework demonstrates handling of:

- Dynamic web elements
- Explicit waits
- JavaScript alerts
- Confirmation and prompt dialogs
- Multiple browser windows and tabs
- Frames and nested frames
- Shadow DOM
- Mouse hover actions
- Keyboard interactions
- File uploads and downloads
- HTTP authentication
- Dynamic content
- Web tables
- JavaScript execution
- Browser navigation
- Geolocation
- Page scrolling
- Element state validation

---

## 📊 Test Reporting

Allure Report is integrated into the project to provide detailed
test execution reports.

The reports include:

- Test descriptions
- Test severity
- Test steps
- Test status
- Screenshots
- Failure information

Screenshots are also captured when test cases fail to help with
debugging and failure analysis.

---

## 🧩 TestNG

TestNG is used for:

- Test execution
- Assertions
- Test grouping
- Test priorities
- Suite execution
- Parallel execution

Tests can be executed using the configured `testng.xml` suite.

Example:

```bash
mvn test
