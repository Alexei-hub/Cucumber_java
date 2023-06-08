package patterns.structural.bridge.app;

import patterns.structural.bridge.developer.Developer;

public class FilterTask extends Program {

    public FilterTask(Developer developer) {
        super(developer);
    }

    @Override
    public void writeCode() {
        developer.setDeveloper();
        System.out.println("Start writing code for filter task");
    }

}
