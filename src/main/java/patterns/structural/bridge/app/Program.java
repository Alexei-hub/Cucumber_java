package patterns.structural.bridge.app;

import patterns.structural.bridge.developer.Developer;

public abstract class Program {
    public Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    abstract public void writeCode();
}
