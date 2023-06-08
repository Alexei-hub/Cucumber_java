package patterns.generative.abstactFactory.browser;

import patterns.generative.abstactFactory.env.EnvFactory;
import patterns.generative.abstactFactory.env.IEnvironment;
import patterns.generative.abstactFactory.facroty.IGeneralFactory;
import patterns.generative.factory.IBrowser;

public class BrowserFactory implements IGeneralFactory {
    public IBrowser initBrowser(String browser) {
        browser = browser.toLowerCase();
        return switch (browser) {
            case "chrome" -> new Chrome();
            case "safari" -> new Safari();
            default -> null;
        };
    }

    @Override
    public IEnvironment initEnv(String env) {
        return new EnvFactory().initEnv(env);
    }


}
