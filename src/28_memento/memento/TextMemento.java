package memento;

public class TextMemento {

    private final String content;

    TextMemento(String content) {
        this.content = content;
    }

    String getContent() {
        return content;
    }
}
