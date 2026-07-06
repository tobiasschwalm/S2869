package template_method;

import java.util.List;

public abstract class ReportExporter {

    public final void export() {
        List<String> data = readData();
        String formatted = formatData(data);
        writeOutput(formatted);
    }

    private List<String> readData() {
        return List.of("Umsatz: 12.400 EUR", "Bestellungen: 87", "Retouren: 3");
    }

    protected abstract String formatData(List<String> data);

    protected abstract void writeOutput(String content);
}
