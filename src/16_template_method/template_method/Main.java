package template_method;

public class Main {

    public static void main(String[] args) {
        ReportExporter exporter = new PdfReportExporter();
        exporter.export();

        System.out.println("---");

        exporter = new CsvReportExporter();
        exporter.export();
    }
}
