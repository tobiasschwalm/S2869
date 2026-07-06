package visitor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DocumentElement> document = List.of(
            new TextElement("Willkommen im Handbuch"),
            new ImageElement("logo.png"),
            new TextElement("Erste Schritte")
        );

        System.out.println("=== HTML ===");
        ExportVisitor html = new HtmlExporter();
        for (DocumentElement e : document) {
            e.accept(html);
        }

        System.out.println("\n=== Markdown ===");
        ExportVisitor md = new MarkdownExporter();
        for (DocumentElement e : document) {
            e.accept(md);
        }
    }
}
