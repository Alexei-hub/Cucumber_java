package patterns.structural.bridge.developer;

public class JuniorDeveloper implements Developer {
    @Override
    public void setDeveloper() {
        System.out.println("setting Junior Developer on this task");
    }
}
