package patterns.generative.abstactFactory.env;

public class TestEnv implements IEnvironment {

    @Override
    public void setEnv() {
        System.out.println("setting test env");
    }
}
