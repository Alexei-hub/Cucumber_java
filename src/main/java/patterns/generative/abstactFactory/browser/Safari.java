package patterns.generative.abstactFactory.browser;

import patterns.generative.factory.IBrowser;

public class Safari implements IBrowser {
    @Override
    public void init() {
        System.out.println("init Safari");
    }
}
