package patterns.behavioral.template;

// позволяет для подкласса переопределеить все абстрактные методы и запустить их один методом
public class Launch {
    public static void main(String[] args) {
        Project search = new Search("qc-25");
        search.startWorkflow();

        Project login = new Login("qc-33");
        login.startWorkflow();
    }
}
