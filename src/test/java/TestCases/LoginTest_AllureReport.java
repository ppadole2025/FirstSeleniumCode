package TestCases;
import io.qameta.allure.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_AllureReport {
    @Test(description = "Verify Google Title")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Authentication")
    @Feature("Login Page")
    @Story("Valid Login")
    public void verifyTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Allure.step("Verify page title");
        Assert.assertTrue(driver.getTitle().contains("Google"));

        driver.quit();
    }
}
