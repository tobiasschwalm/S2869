package command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test void executeAddsTaskToList() {
        TaskList receiver = new TaskList();
        new AddTaskCommand(receiver, "Aufgabe A").execute();
        assertTrue(receiver.getTasks().contains("Aufgabe A"));
        assertEquals(1, receiver.getTasks().size());
    }

    @Test void undoRemovesTaskFromList() {
        TaskList receiver = new TaskList();
        AddTaskCommand cmd = new AddTaskCommand(receiver, "Aufgabe A");
        cmd.execute();
        cmd.undo();
        assertFalse(receiver.getTasks().contains("Aufgabe A"));
        assertEquals(0, receiver.getTasks().size());
    }

    @Test void taskManagerExecutesCommands() {
        TaskList list = new TaskList();
        TaskManager manager = new TaskManager();
        manager.executeCommand(new AddTaskCommand(list, "Task 1"));
        manager.executeCommand(new AddTaskCommand(list, "Task 2"));
        assertEquals(2, list.getTasks().size());
    }

    @Test void taskManagerUndoesLastCommand() {
        TaskList list = new TaskList();
        TaskManager manager = new TaskManager();
        manager.executeCommand(new AddTaskCommand(list, "Task 1"));
        manager.executeCommand(new AddTaskCommand(list, "Task 2"));
        manager.undoLast();
        assertEquals(1, list.getTasks().size());
        assertTrue(list.getTasks().contains("Task 1"));
        assertFalse(list.getTasks().contains("Task 2"));
    }
}
