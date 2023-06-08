package patterns.behavioral.state;

public class Developer implements IState {
    @Override
    public void isWorking() {
        System.out.println("Developer is working under task");
    }
}
