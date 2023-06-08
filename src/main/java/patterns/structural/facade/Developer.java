package patterns.structural.facade;

public class Developer implements Develop{
    @Override
    public void getTask() {
        System.out.println("Developer got task");
    }

    @Override
    public void writeCode() {
        System.out.println("Developer begin write code");
    }
}
