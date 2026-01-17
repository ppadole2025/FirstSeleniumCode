package TestCases;
import org.testng.annotations.Test;

import java.sql.Time;
import java.sql.Timestamp;


public class GoogleTest_ParallelExecution extends BaseTest {

    @Test
    public void openGoogle() {
        getDriver().get("https://www.google.com");
        System.out.println("Title: " + getDriver().getTitle());

    }

  //  @Test
    public void openGmail() {
        getDriver().get("https://mail.google.com");
        System.out.println("Title: " + getDriver().getTitle());
    }
}
