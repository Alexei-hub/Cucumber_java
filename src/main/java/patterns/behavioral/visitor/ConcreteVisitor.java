package patterns.behavioral.visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void doTest() {
        System.out.println("Do test with visitor");
    }

    @Override
    public void doDevelop() {
        System.out.println("Developing with visitor");
    }
}
