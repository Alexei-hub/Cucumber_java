import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.Thread.sleep;

public class ForTest {

    @Test
    public void testMethod() throws MalformedURLException, InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println("HERE");
        sleep(40000);
        driver.quit();

    }
}
