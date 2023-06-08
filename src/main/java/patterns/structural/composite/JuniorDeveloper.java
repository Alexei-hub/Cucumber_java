package patterns.structural.composite;

public class JuniorDeveloper implements Develop {
    @Override
    public void writeCode(String project) {
        System.out.println("This junior will be work on project " + project);
    }
}
