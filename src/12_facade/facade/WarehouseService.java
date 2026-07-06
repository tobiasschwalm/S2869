package facade;

public class WarehouseService {

    public void reserveStock(String orderId) {
        System.out.println("Lager: Bestand für Bestellung " + orderId + " reserviert.");
    }
}
