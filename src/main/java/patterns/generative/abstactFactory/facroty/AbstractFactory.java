package patterns.generative.abstactFactory.facroty;

import patterns.generative.abstactFactory.browser.BrowserFactory;
import patterns.generative.abstactFactory.env.EnvFactory;

public class AbstractFactory {

   public IGeneralFactory createGeneralFactory(String typeOfFactory) {
        return switch (typeOfFactory) {
            case "Browser" -> new BrowserFactory();
            case "Environment" -> new EnvFactory();
            default -> null;
        };
    }

}
