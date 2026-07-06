package composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class CompositeTest {

    static String capture(Runnable r) {
        PrintStream orig = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        try { r.run(); } finally { System.setOut(orig); }
        return buf.toString();
    }

    @Test void emptyDirectoryHasSizeZero() {
        assertEquals(0, new Directory("leer").getSize());
    }

    @Test void directoryAggregatesFileSizes() {
        Directory dir = new Directory("d");
        dir.add(new File("a.txt", 100));
        dir.add(new File("b.txt", 200));
        assertEquals(300, dir.getSize());
    }

    @Test void nestedDirectoriesAggregateRecursively() {
        Directory inner = new Directory("inner");
        inner.add(new File("x.txt", 50));
        Directory outer = new Directory("outer");
        outer.add(inner);
        outer.add(new File("y.txt", 150));
        assertEquals(200, outer.getSize());
    }

    @Test void printOutputsDirectoryAndFileNames() {
        Directory dir = new Directory("mydir");
        dir.add(new File("f.txt", 10));
        String out = capture(() -> dir.print(""));
        assertTrue(out.contains("mydir"), "Verzeichnisname fehlt in: " + out);
        assertTrue(out.contains("f.txt"), "Dateiname fehlt in: " + out);
    }
}
