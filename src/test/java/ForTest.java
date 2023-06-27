import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class ForTest {

    @Test
    public void testMethod() throws MalformedURLException, InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        Configuration.remote = "http://localhost:4444/wd/hub";
//        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        open("http://www.google.com");
        System.out.println("HERE");
        sleep(40000);
    }
}
