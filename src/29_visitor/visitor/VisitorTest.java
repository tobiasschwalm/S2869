package visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class VisitorTest {

    static String capture(Runnable r) {
        PrintStream orig = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        try { r.run(); } finally { System.setOut(orig); }
        return buf.toString();
    }

    @Test void markdownExporterOutputsTextContent() {
        String out = capture(() -> new TextElement("Hallo").accept(new MarkdownExporter()));
        assertTrue(out.contains("Hallo"), "Text fehlt in: " + out);
    }

    @Test void markdownExporterFormatsImage() {
        String out = capture(() -> new ImageElement("bild.png").accept(new MarkdownExporter()));
        assertTrue(out.contains("bild.png"), "Bildpfad fehlt in: " + out);
        assertTrue(out.contains("!["),       "Markdown-Bildsyntax '![' fehlt in: " + out);
    }

    @Test void htmlExporterFormatsTextAsParagraph() {
        String out = capture(() -> new TextElement("Test").accept(new HtmlExporter()));
        assertTrue(out.contains("<p>"),  "p-Tag fehlt: " + out);
        assertTrue(out.contains("Test"), "Inhalt fehlt: " + out);
    }

    @Test void htmlExporterFormatsImageAsImgTag() {
        String out = capture(() -> new ImageElement("foto.jpg").accept(new HtmlExporter()));
        assertTrue(out.contains("<img"),     "img-Tag fehlt: " + out);
        assertTrue(out.contains("foto.jpg"), "Bildpfad fehlt: " + out);
    }
}
