package patterns.behavioral.visitor;

//С помощью интерфейса виситор и его имплементации позволяет передавать различные реализации
//Позволяет создавать новые операции, не меняя классы объектов, над которыми эти операции могут выполняться.
public class Launch {
    public static void main(String[] args) {
        Project project = new Aqa();
        project.doJob(new ConcreteVisitor());

        Project project1 = new Developer();
        project1.doJob(new ConcreteVisitor());
    }
}
