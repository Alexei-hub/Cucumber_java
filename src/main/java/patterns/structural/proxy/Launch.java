package patterns.structural.proxy;

//Представляет объекты, которые могут контролировать другие объекты перехватывая их вызовы.
// Можно перехватить вызов оригинального объекта.
public class Launch {
    public static void main(String[] args) {
        IDB dbCon = new DBconn();
        IDB dbProxy = new DBProxy();
        dbCon.con();
        dbProxy.con();
    }
}
