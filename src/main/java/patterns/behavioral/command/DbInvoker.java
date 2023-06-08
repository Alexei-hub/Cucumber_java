package patterns.behavioral.command;

public class DbInvoker implements Command {
   private final Command command;

    public DbInvoker(Command command) {
        this.command = command;
    }

    @Override
    public void execute() {
        this.command.execute();
    }
}
