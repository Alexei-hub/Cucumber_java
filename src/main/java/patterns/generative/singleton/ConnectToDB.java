package patterns.generative.singleton;

public class ConnectToDB {

    private static final ConnectToDB connectToDB = new ConnectToDB();

    private ConnectToDB() {
        System.out.println("new DB");
    }

    public static synchronized ConnectToDB getConnectToDB() {
        return connectToDB;
    }


}
