package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {
    private static final ExtentReports extent = new ExtentReports();
    private static final ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
    
    static {
        extent.attachReporter(spark);
    }

    public static ExtentTest createTest(String testName) {
        return extent.createTest(testName);
    }

    public static void flushReport() {
        extent.flush();
    }
}
