package patterns.structural.decorator;

public class UpperCaseFileReader extends FileReaderDecorator {

    public UpperCaseFileReader(IReader iReader) {
        super(iReader);
    }

    @Override
    public void read() {
        iReader.read();
        readInUpperCase();
    }

    @Override
    void readInUpperCase() {
        System.out.println("READ IN UPPER CASE");
    }
}
