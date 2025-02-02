package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            // Define report location inside test-output
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";

            // Ensure test-output directory exists
            new File(System.getProperty("user.dir") + "/test-output").mkdirs();

            // ✅ Use ExtentSparkReporter (Latest version)
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

            // ✅ Make sure you call config() correctly
            sparkReporter.config().setReportName("Automation Test Report");
            sparkReporter.config().setDocumentTitle("Test Execution Results");
            sparkReporter.config().setTheme(Theme.DARK); // DARK or STANDARD

            // ✅ Attach the reporter properly
            extent = new ExtentReports();
            extent.attachReporter1(sparkReporter);
        }
        return extent;
    }
}
