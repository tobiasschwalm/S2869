package memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<TextMemento> stack = new ArrayDeque<>();
    private final TextEditor editor;

    public History(TextEditor editor) {
        this.editor = editor;
    }

    // TODO: Speichern Sie den aktuellen Zustand des Editors auf dem Stack
    public void save() {
    }

    // TODO: Falls der Stack nicht leer ist, stellen Sie den letzten Zustand wieder her
    public void undo() {
    }
}
