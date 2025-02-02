# Selenium_Project
# NblAutomationTest - Selenium Java Maven Project

## 📌 Project Overview
This project automates the **Nbyula** website's university shortlisting process using **Selenium with Java**. It interacts with various UI elements like buttons, dropdowns, and inputs to simulate a user journey. The framework is built using **Maven**, and the test execution can be done within **Eclipse IDE**.

## 🚀 Features Implemented
- Automated navigation through [https://nbl.one](https://nbl.one)
- Selection of university shortlisting options
- Clicking elements using **WebDriverWait** and **JavaScriptExecutor**
- Automated handling of UI elements like checkboxes, dropdowns, and buttons
- Exception handling and test logging

## 🛠️ Tech Stack Used
- **Java** (Programming Language)
- **Selenium WebDriver** (UI Automation)
- **Maven** (Build Tool & Dependency Management)
- **Extent Reports** (Reporting) *(To be integrated)*

## 📂 Project Structure
```
NblAutomationTest/
├── src/main/java/tests/NblAutomationTest.java  # Main Test Script
├── pom.xml                                     # Maven dependencies
├── Driver/                                     # ChromeDriver executable
└── README.md                                   # Project Documentation
```

## ⚙️ Setup & Installation
### 1️⃣ Prerequisites
Ensure the following are installed:
- **Java JDK 8+** → [Download Here](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Eclipse IDE** → [Download Here](https://www.eclipse.org/downloads/)
- **Maven** → [Download Here](https://maven.apache.org/download.cgi)
- **Google Chrome** (Latest Version)

### 2️⃣ Clone the Repository
```sh
git clone https://github.com/sumitmohanty22/Selenium_Project.git
cd NblAutomationTest
```

### 3️⃣ Install Dependencies
Navigate to the project directory and run:
```sh
mvn clean install
```

### 4️⃣ Run the Test Script
Execute the test using:
```sh
mvn test
```
Or, run the `NblAutomationTest.java` file inside the `tests` package in Eclipse.

## 🔹 Maven Dependencies (pom.xml)
Ensure your `pom.xml` includes the following dependencies:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.3.0</version>
    </dependency>
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.0.9</version>
    </dependency>
</dependencies>
```

## 📊 Extent Reports (To Be Integrated)
The project will be enhanced by integrating **Extent Reports** to generate detailed test execution reports. This can be implemented in the next phase.

## ❗ Troubleshooting
- If `chromedriver` path is incorrect, update it in `System.setProperty("webdriver.chrome.driver", "<path-to-chromedriver>");`
- Ensure **ChromeDriver** version matches your **Google Chrome** version.
- If tests fail due to timeouts, increase `WebDriverWait` duration.

## 👨‍💻 Author
- **Your Name**
- 📧 Contact: `mohantysumit492@gmail.com`
- 🔗 GitHub: [github.com/sumitmohanty22](https://github.com/sumitmohanty22)

---
✔️ Happy Testing with Selenium! 🚀

