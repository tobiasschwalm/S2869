package memento;

public class Main {

    public static void main(String[] args) {
        TextEditor editor  = new TextEditor();
        History    history = new History(editor);

        editor.setText("Erster Entwurf");
        history.save();

        editor.setText("Zweiter Entwurf");
        history.save();

        editor.setText("Dritter Entwurf");
        System.out.println("Aktuell:    " + editor.getText());  // Dritter Entwurf

        history.undo();
        System.out.println("Nach Undo:  " + editor.getText());  // Zweiter Entwurf

        history.undo();
        System.out.println("Nach Undo:  " + editor.getText());  // Erster Entwurf
    }
}
