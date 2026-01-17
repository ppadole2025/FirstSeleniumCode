package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest_SeleniumGrid {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void verifyValidLogin1() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String actualText = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualText.contains("You logged into a secure area"));
    }
    @Test
    public void verifyValidLogin2() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String actualText = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualText.contains("You logged into a secure area"));
    }
    @Test
    public void verifyValidLogin3() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String actualText = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualText.contains("You logged into a secure area34" +
                ""));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
