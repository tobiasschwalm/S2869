package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test void noDiscountReturnsValueUnchanged() {
        NoDiscount nd = new NoDiscount();
        assertEquals(100.0, nd.apply(100.0), 1e-9);
        assertEquals(0.0,   nd.apply(0.0),   1e-9);
        assertEquals(55.5,  nd.apply(55.5),  1e-9);
    }

    @Test void percentageDiscountCalculatesCorrectly() {
        assertEquals(80.0, new PercentageDiscount(20).apply(100.0),  1e-9);
        assertEquals(85.0, new PercentageDiscount(15).apply(100.0),  1e-9);
        assertEquals(50.0, new PercentageDiscount(50).apply(100.0),  1e-9);
        assertEquals(0.0,  new PercentageDiscount(100).apply(100.0), 1e-9);
    }

    @Test void orderDelegatesToStrategy() {
        Order order = new Order();
        order.setDiscountStrategy(new NoDiscount());
        assertEquals(100.0, order.getTotal(100.0), 1e-9);

        order.setDiscountStrategy(new PercentageDiscount(20));
        assertEquals(80.0, order.getTotal(100.0), 1e-9);
    }

    @Test void strategyCanBeChangedAtRuntime() {
        Order order = new Order();
        order.setDiscountStrategy(new PercentageDiscount(20));
        assertEquals(80.0, order.getTotal(100.0), 1e-9);

        order.setDiscountStrategy(new PercentageDiscount(15));
        assertEquals(85.0, order.getTotal(100.0), 1e-9);
    }
}
