package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class ObserverTest {

    static class TrackingObserver implements Observer {
        final List<OrderStatus> received = new ArrayList<>();
        @Override public void update(OrderStatus status) { received.add(status); }
    }

    @Test void attachedObserverReceivesUpdate() {
        Order order = new Order();
        TrackingObserver obs = new TrackingObserver();
        order.attach(obs);
        order.setStatus(OrderStatus.BEZAHLT);
        assertEquals(1, obs.received.size());
        assertEquals(OrderStatus.BEZAHLT, obs.received.get(0));
    }

    @Test void allAttachedObserversReceiveUpdate() {
        Order order = new Order();
        TrackingObserver obs1 = new TrackingObserver();
        TrackingObserver obs2 = new TrackingObserver();
        order.attach(obs1);
        order.attach(obs2);
        order.setStatus(OrderStatus.BEZAHLT);
        assertEquals(1, obs1.received.size());
        assertEquals(1, obs2.received.size());
    }

    @Test void detachedObserverStopsReceivingUpdates() {
        Order order = new Order();
        TrackingObserver obs = new TrackingObserver();
        order.attach(obs);
        order.setStatus(OrderStatus.BEZAHLT);
        order.detach(obs);
        order.setStatus(OrderStatus.VERSANDT);
        assertEquals(1, obs.received.size(), "Nach detach() darf kein weiteres Update ankommen");
    }

    @Test void getStatusReturnsCurrentStatus() {
        Order order = new Order();
        order.attach(new TrackingObserver());
        order.setStatus(OrderStatus.GELIEFERT);
        assertEquals(OrderStatus.GELIEFERT, order.getStatus());
    }
}
