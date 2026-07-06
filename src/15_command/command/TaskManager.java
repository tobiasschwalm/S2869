package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskManager {

    private Deque<Command> history = new ArrayDeque<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            history.pop().undo();
        } else {
            System.out.println("Nichts rückgängig zu machen.");
        }
    }

}
