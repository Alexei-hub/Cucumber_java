package patterns.generative.abstactFactory.env;

public class ProdEnv implements IEnvironment {

    @Override
    public void setEnv() {
        System.out.println("setting prod env");
    }
}
