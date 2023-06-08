package patterns.behavioral.state;

public class TaskContext implements IState {
    private  IState iState;

    public TaskContext(IState iState) {
        this.iState = iState;
    }

    public void setIState(IState iState) {
        this.iState = iState;
    }

    @Override
    public void isWorking() {
        this.iState.isWorking();
    }
}
