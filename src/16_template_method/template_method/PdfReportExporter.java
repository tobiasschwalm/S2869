package template_method;

import java.util.List;

public class PdfReportExporter extends ReportExporter {

    @Override
    protected String formatData(List<String> data) {
        // TODO: Daten mit Zeilenumbrüchen und dem Prefix "[PDF] " zusammenführen
        return null;
    }

    @Override
    protected void writeOutput(String content) {
        // TODO: Ausgabe auf der Konsole mit dem Hinweis "Schreibe PDF:" ausgeben
    }

}
