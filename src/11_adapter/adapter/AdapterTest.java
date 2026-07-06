package adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class AdapterTest {

    static String capture(Runnable r) {
        PrintStream orig = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        try { r.run(); } finally { System.setOut(orig); }
        return buf.toString();
    }

    @Test void outputContainsOrderId() {
        String out = capture(() -> new PaymentAdapter().pay(new PaymentRequest(99.90, "ORD-042")));
        assertTrue(out.contains("ORD-042"), "Bestellnummer fehlt in: " + out);
    }

    @Test void outputContainsAmount() {
        String out = capture(() -> new PaymentAdapter().pay(new PaymentRequest(99.90, "ORD-042")));
        assertTrue(out.contains("99"), "Betrag fehlt in: " + out);
    }

    @Test void differentCallsPassCorrectValues() {
        String out = capture(() -> new PaymentAdapter().pay(new PaymentRequest(249.0, "ORD-007")));
        assertTrue(out.contains("ORD-007"), "Bestellnummer ORD-007 fehlt in: " + out);
        assertTrue(out.contains("249"),     "Betrag 249 fehlt in: " + out);
    }

    @Test void implementsPaymentProvider() {
        assertInstanceOf(PaymentProvider.class, new PaymentAdapter());
    }
}
