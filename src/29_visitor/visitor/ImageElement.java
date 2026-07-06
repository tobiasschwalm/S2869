package visitor;

public class ImageElement implements DocumentElement {

    final String src;

    public ImageElement(String src) {
        this.src = src;
    }

    @Override
    public void accept(ExportVisitor visitor) {
        visitor.visit(this);
    }
}
