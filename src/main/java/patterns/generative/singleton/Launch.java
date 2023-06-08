package patterns.generative.singleton;

// позволяет создать экзепляр класса только один раз
public class Launch {
    public static void main(String[] args) {
        ConnectToDB connectToDB = ConnectToDB.getConnectToDB();
    }
}
