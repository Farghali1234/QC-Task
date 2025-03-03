# Amazon Automation Test

This project is a basic framework for automating tests on the Amazon website. It uses Selenium WebDriver with Java, TestNG, and ExtentReports for reporting.

## Prerequisites

Before running the tests, ensure you have the following installed:

* **Java Development Kit (JDK):** Version 17 or higher recommended.  [Download](https://www.oracle.com/java/technologies/downloads/)
* **Maven:**  For dependency management. [Download](https://maven.apache.org/download.cgi)
* **Google Chrome:**  The tests are currently configured for Chrome.
* **ChromeDriver:** Ensure the ChromeDriver version matches your Chrome browser version.  Place the `chromedriver.exe` (Windows) or `chromedriver` (Mac/Linux) in the `src/test/resources` directory. [Download](https://chromedriver.chromium.org/downloads)
* **IDE (Integrated Development Environment):** IntelliJ IDEA or Eclipse recommended.

## Project Setup

**Clone the repository:**
   ```bash
   git clone <repository_url>
