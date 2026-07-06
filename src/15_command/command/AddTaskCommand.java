package command;

public class AddTaskCommand implements Command {

    private TaskList receiver;
    private String task;

    public AddTaskCommand(TaskList receiver, String task) {
        this.receiver = receiver;
        this.task = task;
    }

    @Override
    public void execute() {
        // TODO: Aufgabe beim Receiver hinzufügen
    }

    @Override
    public void undo() {
        // TODO: Aufgabe beim Receiver entfernen
    }
}
