package singleton;

public class Main {

    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();

        c1.increment();
        c1.increment();
        c2.increment();

        System.out.println("Wert:          " + c1.getValue());     // Erwartet: 3
        System.out.println("Selbe Instanz: " + (c1 == c2));        // Erwartet: true
    }
}
