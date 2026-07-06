package memento;

public class TextEditor {

    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // TODO: Erzeugen Sie einen neuen TextMemento mit dem aktuellen text
    public TextMemento createMemento() {
        return null;
    }

    // TODO: Stellen Sie text aus memento.getContent() wieder her
    public void restoreMemento(TextMemento memento) {
    }
}
