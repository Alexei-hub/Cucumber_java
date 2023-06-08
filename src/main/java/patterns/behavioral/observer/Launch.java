package patterns.behavioral.observer;

//Позволяет одним объектам наблюдать за действиями что происходят в других объектах.
public class Launch {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Observer observer = new ObserverHandler();
        employee.addEmployee("Alex", "AQA");
        employee.addEmployee("Igor", "DEV");
        observer.event(employee.employeesList);
    }
}
