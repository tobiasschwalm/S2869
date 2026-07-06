package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test void circleContainsShapeAndColor() {
        String result = new Circle(new Red()).draw();
        assertNotNull(result);
        assertTrue(result.toLowerCase().contains("kreis"), "Ergebnis soll 'Kreis' enthalten: " + result);
        assertTrue(result.contains("rot"),                 "Ergebnis soll Farbe enthalten: " + result);
    }

    @Test void squareContainsShapeAndColor() {
        String result = new Square(new Blue()).draw();
        assertNotNull(result);
        assertTrue(result.toLowerCase().contains("quadrat"), "Ergebnis soll 'Quadrat' enthalten: " + result);
        assertTrue(result.contains("blau"),                  "Ergebnis soll Farbe enthalten: " + result);
    }

    @Test void sameShapeWithDifferentColorsProducesDifferentOutput() {
        assertNotEquals(new Circle(new Red()).draw(), new Circle(new Blue()).draw());
    }

    @Test void sameColorWithDifferentShapesProducesDifferentOutput() {
        assertNotEquals(new Circle(new Red()).draw(), new Square(new Red()).draw());
    }
}
