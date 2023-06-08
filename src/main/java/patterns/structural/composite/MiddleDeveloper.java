package patterns.structural.composite;

public class MiddleDeveloper implements Develop {
    @Override
    public void writeCode(String project) {

        System.out.println("This middle will be work on project " + project);
    }
}
