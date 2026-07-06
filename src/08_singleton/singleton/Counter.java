package singleton;

public class Counter {

    // TODO: Deklarieren Sie eine private statische Instanzvariable vom Typ Counter
    //       private static Counter instance;

    private int value;

    // TODO: Machen Sie den Konstruktor privat (Stichwort: private Counter())
    Counter() {
        value = 0;
    }

    // TODO: Implementieren Sie getInstance() mit Lazy Initialization
    //       Falls instance == null → neue Instanz erzeugen und in instance speichern
    //       Anschließend instance zurückgeben
    public static Counter getInstance() {
        return null;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }

}
