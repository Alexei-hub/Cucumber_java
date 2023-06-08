package patterns.structural.facade;

public class Facade implements Develop {
    private final AQA aqa;
    private final Developer developer;

    public Facade(AQA aqa, Developer developer) {
        this.aqa = new AQA();
        this.developer = new Developer();
    }


    @Override
    public void getTask() {
        developer.getTask();
        aqa.getTask();
    }

    @Override
    public void writeCode() {
        developer.writeCode();
        aqa.writeCode();
    }
}
