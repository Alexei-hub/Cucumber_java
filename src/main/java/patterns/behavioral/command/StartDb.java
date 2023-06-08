package patterns.behavioral.command;

public class StartDb implements Command {
    DataBase dataBase;

    public StartDb(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        this.dataBase.connectingToDB();
    }
}
