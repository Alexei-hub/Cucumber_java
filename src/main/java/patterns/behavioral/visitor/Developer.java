package patterns.behavioral.visitor;

public class Developer implements Project{
    @Override
    public void doJob(Visitor visitor) {
        visitor.doDevelop();
    }
}
