package patterns.behavioral.mediator;


public class Mediator {
    public void sendMsg(Employee employee, String msg) {
        System.out.println("Employee name: " + employee.getName() +
                ", working in department: " + employee.getDepartment()
                + ", " + msg);
    }
}
