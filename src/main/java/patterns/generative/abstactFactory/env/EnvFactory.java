package patterns.generative.abstactFactory.env;

import patterns.generative.abstactFactory.browser.BrowserFactory;
import patterns.generative.abstactFactory.facroty.IGeneralFactory;
import patterns.generative.factory.IBrowser;

public class EnvFactory implements IGeneralFactory {
    public IEnvironment initEnv(String env) {
        env = env.toLowerCase();
        return switch (env) {
            case "test" -> new TestEnv();
            case "prod" -> new ProdEnv();
            default -> null;
        };
    }

    @Override
    public IBrowser initBrowser(String browser) {
        return new BrowserFactory().initBrowser(browser);
    }
}
