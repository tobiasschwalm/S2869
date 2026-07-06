package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class FacadeTest {

    static String capture(Runnable r) {
        PrintStream orig = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        try { r.run(); } finally { System.setOut(orig); }
        return buf.toString();
    }

    static int pos(String text, String needle) {
        return text.toLowerCase().indexOf(needle.toLowerCase());
    }

    @Test void warehouseServiceIsCalled() {
        String out = capture(() -> new OrderProcessingFacade().placeOrder("ORD-001", 149.99));
        assertTrue(out.toLowerCase().contains("lager") || out.toLowerCase().contains("reserv"),
                "WarehouseService nicht aufgerufen. Ausgabe: " + out);
    }

    @Test void paymentServiceIsCalled() {
        String out = capture(() -> new OrderProcessingFacade().placeOrder("ORD-001", 149.99));
        assertTrue(out.contains("149") || out.toLowerCase().contains("zahl"),
                "PaymentService nicht aufgerufen. Ausgabe: " + out);
    }

    @Test void shippingServiceIsCalled() {
        String out = capture(() -> new OrderProcessingFacade().placeOrder("ORD-001", 149.99));
        assertTrue(out.toLowerCase().contains("versand") || out.toLowerCase().contains("lieferung"),
                "ShippingService nicht aufgerufen. Ausgabe: " + out);
    }

    @Test void servicesAreCalledInCorrectOrder() {
        String out = capture(() -> new OrderProcessingFacade().placeOrder("ORD-001", 149.99));
        int w = Math.max(pos(out, "lager"),   pos(out, "reserv"));
        int p = Math.max(pos(out, "149"),     pos(out, "zahl"));
        int s = Math.max(pos(out, "versand"), pos(out, "lieferung"));
        assertTrue(w >= 0 && p >= 0 && s >= 0 && w < p && p < s,
                "Reihenfolge Lager→Zahlung→Versand nicht eingehalten");
    }
}
