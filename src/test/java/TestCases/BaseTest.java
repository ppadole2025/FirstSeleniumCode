package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.net.URL;
public class BaseTest {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) throws Exception {

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver.set(new RemoteWebDriver(
                    new URL("http://192.168.56.1:4444"), options));

        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver.set(new RemoteWebDriver(
                    new URL("http://192.168.56.1:4444"), options));
        }
        else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver.set(new RemoteWebDriver(
                    new URL("http://192.168.56.1:4444"), options));
        }
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }
}
