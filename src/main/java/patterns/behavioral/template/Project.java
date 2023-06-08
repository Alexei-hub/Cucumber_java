package patterns.behavioral.template;

public abstract class Project {

    private final String task;

    public Project(String task) {
        this.task = task;
    }

    abstract void gettingTask(String task);

    abstract void startWorking(String task);

    abstract void finishing(String task);

    public void startWorkflow() {
        gettingTask(this.task);
        startWorking(this.task);
        finishing(this.task);
    }

}
