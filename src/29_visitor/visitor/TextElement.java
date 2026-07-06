package visitor;

public class TextElement implements DocumentElement {

    final String content;

    public TextElement(String content) {
        this.content = content;
    }

    @Override
    public void accept(ExportVisitor visitor) {
        visitor.visit(this);
    }
}
