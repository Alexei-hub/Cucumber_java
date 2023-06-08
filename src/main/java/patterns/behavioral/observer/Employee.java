package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    List<Observer> observerList = new ArrayList<>();
    List<String> employeesList = new ArrayList<>();

    public void addEmployee(String name, String department) {
        String emp = "Adding new employee " + name + " in department " + department;
        employeesList.add(emp);
        notifyAboutUpdate();
    }

    private void notifyAboutUpdate() {
        for (Observer observer : observerList) {
            observer.event(employeesList);
        }
    }
}
