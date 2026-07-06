package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public int getSize() {
        // TODO: Summieren Sie die Größe aller Kinder
        //       Tipp: children.stream().mapToInt(FileSystemComponent::getSize).sum()
        return 0;
    }

    @Override
    public void print(String prefix) {
        // TODO: Geben Sie prefix + "[" + name + "]" aus,
        //       dann rufen Sie für jedes Kind print(prefix + "  ") auf
    }
}
