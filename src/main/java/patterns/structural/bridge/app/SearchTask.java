package patterns.structural.bridge.app;

import patterns.structural.bridge.developer.Developer;

public class SearchTask extends Program {

    public SearchTask(Developer developer) {
        super(developer);
    }

    @Override
    public void writeCode() {
        developer.setDeveloper();
        System.out.println("Start writing code for search task");
    }
}
