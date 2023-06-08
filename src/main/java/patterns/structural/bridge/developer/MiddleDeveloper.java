package patterns.structural.bridge.developer;

public class MiddleDeveloper implements Developer {
    @Override
    public void setDeveloper() {
        System.out.println("setting Middle Developer on this task");
    }
}
