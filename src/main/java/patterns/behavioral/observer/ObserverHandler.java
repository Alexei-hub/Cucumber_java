package patterns.behavioral.observer;

import java.util.List;

public class ObserverHandler implements Observer {
    @Override
    public void event(List<String> strings) {
        for (String s : strings) {
            System.out.println("updating " + s);
        }
    }
}
