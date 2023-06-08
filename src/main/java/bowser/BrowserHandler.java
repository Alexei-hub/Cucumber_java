package bowser;

import com.codeborne.selenide.Configuration;
import jenkins.JenkinsVariables;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserHandler {

    private final JenkinsVariables JENKINS_VARIABLE;

    public BrowserHandler() {
        JENKINS_VARIABLE = new JenkinsVariables();
    }


    void browserConfig() {
//        Configuration.browserVersion = ();
//        Configuration.browserSize = "3024x1964";
        Configuration.browserPosition = "1x1";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 300000;
    }

    String browserNameHandler(String defaultBrowser) {
        if (JENKINS_VARIABLE.getBROWSER_NAME() == null) {
            return defaultBrowser;
        } else {
            return JENKINS_VARIABLE.getBROWSER_NAME();
        }
    }
}
