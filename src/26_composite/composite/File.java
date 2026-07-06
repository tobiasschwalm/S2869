package composite;

public class File implements FileSystemComponent {

    private final String name;
    private final int    size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + name + " (" + size + " KB)");
    }
}
