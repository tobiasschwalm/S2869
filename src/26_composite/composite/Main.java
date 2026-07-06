package composite;

public class Main {

    public static void main(String[] args) {
        File readme  = new File("readme.txt",  10);
        File photo   = new File("photo.jpg",  500);
        File notes   = new File("notes.txt",   20);

        Directory docs = new Directory("Dokumente");
        docs.add(readme);
        docs.add(notes);

        Directory root = new Directory("root");
        root.add(docs);
        root.add(photo);

        root.print("");
        System.out.println("Gesamtgröße: " + root.getSize() + " KB");
    }
}
