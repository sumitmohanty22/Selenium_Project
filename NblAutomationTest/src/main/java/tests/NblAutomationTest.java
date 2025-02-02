package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NblAutomationTest {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "/home/cavisson/eclipse-workspace/NblAutomationTest/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        // ✅ Fix: Use TimeUnit instead of Duration (For Selenium 3)
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);  
        driver.manage().window().fullscreen(); // Open in full screen

        try {
            // 1. Open URL: https://nbl.one/
            driver.get("https://nbl.one/");
            System.out.println("✅ Opened Nbyula website");

            // ✅ Correct WebDriverWait for Selenium 3
            WebDriverWait wait = new WebDriverWait(driver, 20);

            // 2. Click on "Get University Shortlist"
            WebElement universityShortlistBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Get University Shortlist']")));
            universityShortlistBtn.click();
            System.out.println("✅ Clicked 'Get University Shortlist'");

            // 3. Click on "Master's"
            WebElement mastersOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Master's\"]")));
            mastersOption.click();
            System.out.println("✅ Selected 'Master's' option");
            
            // 4. Click on Search any course
            WebElement psychology = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()=\"Psychology\"]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", psychology);
            wait.until(ExpectedConditions.elementToBeClickable(psychology));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", psychology);
            System.out.println("✅ Selected 'Psychology' option");

            // 5. Search any Destination
            WebElement anyDestination = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=\"United States (U.S.A)\"]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", anyDestination);
            System.out.println("✅ Selected any Destination");

            // 6. Choose Intake
            WebElement chooseIntake = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()=\"2025\"]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", chooseIntake);
            System.out.println("✅ Selected Choose Intake");
            
            //7. My English Scores
            WebElement englishScores = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()=\"Not planning to give exam\"]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", englishScores);
            System.out.println("✅ Selected English Scores");
            
            //8. Select Iam
            WebElement Iam = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Finalised all programs, just looking for best waivers & deals\"]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Iam);
            System.out.println("✅ Selected 'Iam");
            
            //9.Select Get me Shortlist
            WebElement getmeShortList = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=\"GET MY SHORTLIST\"]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", getmeShortList);
            System.out.println("✅ Selected English Scores");

        } catch (Exception e) {
            System.out.println("❌ Test encountered an exception: " + e.getMessage());
        } finally {
            driver.quit(); // Close the browser
        }
    }
}
