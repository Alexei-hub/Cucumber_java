package patterns.structural.decorator;

public class FileReader implements IReader {
    @Override
    public void read() {
        System.out.println("basic read from file");
    }
}
