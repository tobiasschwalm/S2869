package template_method;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class TemplateMethodTest {

    static String capture(Runnable r) {
        PrintStream orig = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        try { r.run(); } finally { System.setOut(orig); }
        return buf.toString();
    }

    @Test void csvOutputContainsHeader() {
        String out = capture(() -> new CsvReportExporter().export());
        assertTrue(out.contains("Schreibe CSV:"), "Fehlender Header: " + out);
    }

    @Test void csvFormatUsesCommaSeparator() {
        String out = capture(() -> new CsvReportExporter().export());
        assertTrue(out.contains(","), "Kein Komma-Trennzeichen: " + out);
    }

    @Test void csvContainsAllDataValues() {
        String out = capture(() -> new CsvReportExporter().export());
        assertTrue(out.contains("Umsatz") && out.contains("Bestellungen") && out.contains("Retouren"),
                "Datenwerte fehlen: " + out);
    }

    @Test void pdfOutputContainsHeader() {
        String out = capture(() -> new PdfReportExporter().export());
        assertTrue(out.contains("Schreibe PDF:"), "Fehlender Header: " + out);
    }

    @Test void pdfFormatUsesPdfPrefix() {
        String out = capture(() -> new PdfReportExporter().export());
        assertTrue(out.contains("[PDF]"), "Kein [PDF]-Prefix: " + out);
    }

    @Test void pdfDoesNotUseCsvCommaSeparator() {
        String out = capture(() -> new PdfReportExporter().export());
        assertFalse(out.contains("Umsatz: 12.400 EUR,"), "PDF enthält CSV-Komma");
    }
}
