package visitor;

public interface ExportVisitor {
    void visit(TextElement element);
    void visit(ImageElement element);
}
