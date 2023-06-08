package patterns.generative.abstactFactory.browser;

import patterns.generative.factory.IBrowser;

public class Chrome implements IBrowser {
    @Override
    public void init() {
        System.out.println("init Chrome");
    }
}
