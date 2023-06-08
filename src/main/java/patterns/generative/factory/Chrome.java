package patterns.generative.factory;

public class Chrome implements IBrowser {
    @Override
    public void init() {
        System.out.println("init Chrome");
    }
}
