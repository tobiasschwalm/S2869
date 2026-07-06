package visitor;

public class HtmlExporter implements ExportVisitor {

    @Override
    public void visit(TextElement element) {
        System.out.println("<p>" + element.content + "</p>");
    }

    @Override
    public void visit(ImageElement element) {
        System.out.println("<img src='" + element.src + "'/>");
    }
}
