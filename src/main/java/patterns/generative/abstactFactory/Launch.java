package patterns.generative.abstactFactory;

import patterns.generative.abstactFactory.facroty.AbstractFactory;
import patterns.generative.abstactFactory.facroty.IGeneralFactory;


//Фабрика фабрик
public class Launch {
    public static void main(String[] args) {
        IGeneralFactory generalFactory = new AbstractFactory().createGeneralFactory("Browser");
        generalFactory.initBrowser("chrome").init();
        generalFactory.initEnv("prod").setEnv();

    }
}
