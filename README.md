# GUI Automation Framework Capstone Project

## Overview

GUI Automation Framework is a robust Selenium-based test automation framework developed using Java, Selenium WebDriver, TestNG, Maven, and the Page Object Model (POM) design pattern. The framework is designed to automate web application testing efficiently while ensuring maintainability, scalability, reusability, and clear reporting.

The framework automates multiple functionalities of the Test Automation Practice application and demonstrates industry-standard automation testing practices, including data-driven testing, reporting, screenshot capture, and CI/CD integration.

---

## Tech Stack

| Technology              | Purpose                       |
| ----------------------- | ----------------------------- |
| Java                    | Programming Language          |
| Selenium WebDriver      | Browser Automation            |
| TestNG                  | Test Execution Framework      |
| Maven                   | Dependency & Build Management |
| Apache POI              | Excel Data Handling           |
| Extent Reports          | Test Reporting                |
| Git & GitHub            | Version Control               |
| Jenkins                 | Continuous Integration        |
| Page Object Model (POM) | Framework Design Pattern      |

---

## Framework Architecture

```text
GUIAutomation_Framework_Capstone_Project
│
├── src
│   └── test
│       ├── java
│       │
│       ├── base
│       │   └── BaseTest.java
│       │
│       ├── pages
│       │   ├── FormPage.java
│       │   ├── DatePickerPage.java
│       │   ├── FileUploadPage.java
│       │   ├── AlertPage.java
│       │   ├── MouseHoverPage.java
│       │   ├── DoubleClickPage.java
│       │   ├── DragAndDropPage.java
│       │   ├── SliderPage.java
│       │   ├── WindowHandlingPage.java
│       │   ├── PaginationTablePage.java
│       │   ├── WikipediaPage.java
│       │   ├── DynamicButtonPage.java
│       │   ├── HiddenElementsPage.java
│       │   ├── AjaxPage.java
│       │   ├── BrokenLinksPage.java
│       │   ├── SVGPage.java
│       │   ├── ScrollingDropdownPage.java
│       │   └── PagesSectionPage.java
│       │
│       ├── tests
│       │   ├── FormTest.java
│       │   ├── DatePickerTest.java
│       │   ├── FileUploadTest.java
│       │   ├── AlertTest.java
│       │   ├── MouseHoverTest.java
│       │   ├── DoubleClickTest.java
│       │   ├── DragAndDropTest.java
│       │   ├── SliderTest.java
│       │   ├── WindowHandlingTest.java
│       │   ├── PaginationTableTest.java
│       │   ├── WikipediaTest.java
│       │   ├── DynamicButtonTest.java
│       │   ├── HiddenElementsTest.java
│       │   ├── AjaxTest.java
│       │   ├── BrokenLinksTest.java
│       │   ├── SVGTest.java
│       │   ├── ScrollingDropdownTest.java
│       │   └── PagesSectionTest.java
│       │
│       ├── utilities
│       │   ├── ConfigReader.java
│       │   ├── ExcelUtils.java
│       │   ├── ScreenshotUtils.java
│       │   ├── WaitUtils.java
│       │   └── ExtentManager.java
│       │
│       └── listeners
│           └── TestListener.java
│
├── reports
│   └── ExtentReport.html
│
├── screenshots
│
├── testng.xml
├── pom.xml
├── Jenkinsfile
└── README.md
```

---

## Key Features

* Page Object Model (POM) Framework
* Data-Driven Testing using Excel
* TestNG Assertions and Annotations
* Extent Report Generation
* Screenshot Capture on Failure
* TestNG Listener Implementation
* Maven Build Management
* Reusable Utility Classes
* GitHub Version Control
* Jenkins CI/CD Integration

---

## Automated Test Scenarios

### Core Web Elements

* Form Handling
* Date Picker Validation
* File Upload Functionality
* Alert Handling
* Mouse Hover Actions
* Double Click Operations
* Drag and Drop Actions
* Slider Validation

### Advanced Selenium Concepts

* Window Handling
* Pagination Web Table
* Dynamic Button Validation
* Hidden Elements Validation
* AJAX Content Validation
* SVG Elements Automation
* Scrolling Dropdown Handling
* Multi-Page Navigation

### Validation Modules

* Wikipedia Search Validation
* Broken Links Verification
* Pages Section Validation

---

## Reporting

The framework generates detailed execution reports using Extent Reports.

### Report Location

```text
reports/ExtentReport.html
```

### Failure Handling

* Automatic Screenshot Capture
* Screenshot Attachment in Extent Reports
* Failure Logging using TestNG Listeners

---

## Test Execution

### Execute Using TestNG

Run:

```text
testng.xml
```

### Execute Using Maven

```bash
mvn clean test
```

---

## Jenkins CI/CD Integration

The framework is integrated with Jenkins Pipeline for automated execution.

### CI/CD Workflow

```text
GitHub Repository
        ↓
Jenkins Pipeline
        ↓
Source Code Checkout
        ↓
Maven Build
        ↓
TestNG Execution
        ↓
Extent Report Generation
        ↓
Build Status
```

---

## Project Outcome

This project demonstrates the implementation of a scalable and maintainable Selenium Automation Framework using industry-standard tools and practices. It covers web element automation, reporting, data-driven testing, framework design, and CI/CD integration, making it suitable for real-world automation testing projects.
