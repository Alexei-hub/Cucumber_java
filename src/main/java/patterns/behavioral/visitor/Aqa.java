package patterns.behavioral.visitor;

public class Aqa implements Project{
    @Override
    public void doJob(Visitor visitor) {
        visitor.doTest();
    }
}
