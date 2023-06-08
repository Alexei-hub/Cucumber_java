package patterns.behavioral.template;

public class Login extends Project {

    public Login(String task) {
        super(task);
    }

    @Override
    void gettingTask(String task) {
        System.out.println("Getting task " + task + " in work");
    }

    @Override
    void startWorking(String task) {
        System.out.println("Starting work under " + task);

    }

    @Override
    void finishing(String task) {
        System.out.println("Finishing work under " + task);
    }
}
