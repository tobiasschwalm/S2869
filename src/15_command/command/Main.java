package command;

public class Main {

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        TaskManager invoker = new TaskManager();

        invoker.executeCommand(new AddTaskCommand(taskList, "Rechnung prüfen"));
        invoker.executeCommand(new AddTaskCommand(taskList, "Angebot erstellen"));

        System.out.println("Aufgaben: " + taskList.getTasks());

        invoker.undoLast();
        System.out.println("Nach Undo: " + taskList.getTasks());
    }
}
