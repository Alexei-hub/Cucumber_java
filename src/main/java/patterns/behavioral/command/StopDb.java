package patterns.behavioral.command;

public class StopDb implements Command {
    DataBase dataBase;

    public StopDb(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        this.dataBase.stoppingToDB();
    }
}
