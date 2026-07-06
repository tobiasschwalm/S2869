package memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MementoTest {

    @Test void createMementoSnapshotsCurrentText() {
        TextEditor editor = new TextEditor();
        editor.setText("Hallo");
        TextMemento m = editor.createMemento();
        assertNotNull(m);
        assertEquals("Hallo", m.getContent());
    }

    @Test void restoreMementoRestoresText() {
        TextEditor editor = new TextEditor();
        editor.setText("Original");
        TextMemento m = editor.createMemento();
        editor.setText("Geändert");
        editor.restoreMemento(m);
        assertEquals("Original", editor.getText());
    }

    @Test void historyUndoRestoresPreviousState() {
        TextEditor editor  = new TextEditor();
        History    history = new History(editor);

        editor.setText("v1");
        history.save();
        editor.setText("v2");
        history.save();
        editor.setText("v3");

        history.undo();
        assertEquals("v2", editor.getText());

        history.undo();
        assertEquals("v1", editor.getText());
    }

    @Test void undoWithEmptyHistoryDoesNothing() {
        TextEditor editor  = new TextEditor();
        History    history = new History(editor);
        editor.setText("unveraendert");
        history.undo();
        assertEquals("unveraendert", editor.getText());
    }
}
