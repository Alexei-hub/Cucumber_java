package patterns.behavioral.command;


// инкапсуляция операций объектов в отдельный объект
public class Launch {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Command startDb = new StartDb(dataBase);
        Command stopDb = new StopDb(dataBase);
        DbInvoker dbInvoker = new DbInvoker(startDb);
        dbInvoker.execute();

        DbInvoker dbInvoker1 = new DbInvoker(stopDb);
        dbInvoker1.execute();

    }
}
