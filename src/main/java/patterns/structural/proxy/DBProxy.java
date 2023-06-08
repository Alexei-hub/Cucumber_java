package patterns.structural.proxy;

public class DBProxy implements IDB {
    private DBconn dBconn = new DBconn();

    @Override
    public void con() {
        methodForProxy();
        dBconn.con();
    }

    private void methodForProxy() {
        System.out.println("some that execute in proxy class");
    }
}
