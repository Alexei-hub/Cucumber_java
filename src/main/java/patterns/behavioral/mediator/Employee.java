package patterns.behavioral.mediator;

public class Employee {

    private Mediator mediator;
    private String name;
    private String department;

    public Employee(Mediator mediator, String name, String department) {
        this.mediator = mediator;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void sendMsg(String msg) {
        mediator.sendMsg(this, msg);
    }
}
