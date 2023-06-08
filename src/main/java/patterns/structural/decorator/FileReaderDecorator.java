package patterns.structural.decorator;

public abstract class FileReaderDecorator implements IReader {

    IReader iReader;

    public FileReaderDecorator(IReader iReader) {
        this.iReader = iReader;
    }

     abstract void readInUpperCase();
}
