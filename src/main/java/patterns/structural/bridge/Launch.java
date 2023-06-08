package patterns.structural.bridge;

import patterns.structural.bridge.app.FilterTask;
import patterns.structural.bridge.app.SearchTask;
import patterns.structural.bridge.developer.JuniorDeveloper;
import patterns.structural.bridge.developer.MiddleDeveloper;


//Разделяет реализацию и абстракцию, дает возможность изменять их свободно друг от друга.
// Делает конкретные классы независимыми от классов реализации интерфейса.
public class Launch {
    public static void main(String[] args) {

        FilterTask filterTask = new FilterTask(new JuniorDeveloper());
        FilterTask filterTask2 = new FilterTask(new MiddleDeveloper());
        SearchTask searchTask = new SearchTask(new MiddleDeveloper());
        filterTask.writeCode();
        System.out.println("--------------------");
        filterTask2.writeCode();
        System.out.println("--------------------");
        searchTask.writeCode();
    }
}
