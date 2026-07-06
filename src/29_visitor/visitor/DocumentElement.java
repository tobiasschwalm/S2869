package visitor;

public interface DocumentElement {
    void accept(ExportVisitor visitor);
}
