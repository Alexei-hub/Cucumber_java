package patterns.behavioral.state;


//Позволяет объекту изменять свое поведение в зависимости от его состояния.
public class Launch {
    public static void main(String[] args) {
        TaskContext teamContext = new TaskContext(new QA());
        teamContext.isWorking();
        teamContext.setIState(new Developer());
        teamContext.isWorking();
    }
}
