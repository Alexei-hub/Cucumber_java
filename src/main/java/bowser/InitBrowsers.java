package bowser;

import com.codeborne.selenide.Configuration;

public class InitBrowsers extends BrowserHandler {

    String defaultBrowser;

    public InitBrowsers(String defaultBrowser) {
        this.defaultBrowser = defaultBrowser;
    }

    public void initBrowser() {
        Configuration.browser = browserNameHandler(defaultBrowser);
        browserConfig();
    }
}
