package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Observer> observers = new ArrayList<>();
    private OrderStatus status;

    public void attach(Observer observer) {
        // TODO: Observer zur Liste hinzufügen
    }

    public void detach(Observer observer) {
        // TODO: Observer aus der Liste entfernen
    }

    private void notifyObservers() {
        // TODO: Alle Observer benachrichtigen (update() aufrufen)
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        notifyObservers();
    }

    public OrderStatus getStatus() {
        return status;
    }

}
