package patterns.structural.facade;

public class AQA implements Develop {
    @Override
    public void getTask() {
        System.out.println("AQA got task");
    }

    @Override
    public void writeCode() {
        System.out.println("AQA begin write autotest");
    }
}
