package patterns.behavioral.template;

public class Search extends Project {

    public Search(String task) {
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
