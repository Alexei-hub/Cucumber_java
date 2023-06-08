package patterns.behavioral.mediator;

//mediator предосталяет класс посредника для обработки
public class Launch {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Employee employee1 = new Employee(mediator, "Alex", "QA");
        employee1.sendMsg("working in company autodoc");
    }
}
