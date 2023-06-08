package patterns.structural.proxy;

public class DBconn implements IDB {
    @Override
    public void con() {
        System.out.println("connection to DB");
    }
}
