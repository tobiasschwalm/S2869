package template_method;

import java.util.List;

public class CsvReportExporter extends ReportExporter {

    @Override
    protected String formatData(List<String> data) {
        // TODO: Daten als kommaseparierte Zeile zusammenführen
        return null;
    }

    @Override
    protected void writeOutput(String content) {
        // TODO: Ausgabe auf der Konsole mit dem Hinweis "Schreibe CSV:" ausgeben
    }
}
