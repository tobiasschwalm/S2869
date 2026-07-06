package command;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Aufgabe hinzugefügt: " + task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
        System.out.println("Aufgabe entfernt: " + task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
