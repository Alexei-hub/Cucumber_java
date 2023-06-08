package patterns.behavioral.state;

public class QA implements IState {
    @Override
    public void isWorking() {
        System.out.println("QA is working under task");
    }
}
