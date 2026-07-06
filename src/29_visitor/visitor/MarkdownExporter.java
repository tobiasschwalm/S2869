package visitor;

public class MarkdownExporter implements ExportVisitor {

    @Override
    public void visit(TextElement element) {
        // TODO: Geben Sie element.content direkt aus
    }

    @Override
    public void visit(ImageElement element) {
        // TODO: Geben Sie aus: "![" + element.src + "](" + element.src + ")"
    }
}
