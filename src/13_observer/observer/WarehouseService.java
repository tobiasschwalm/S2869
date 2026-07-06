package observer;

public class WarehouseService implements Observer {

    @Override
    public void update(OrderStatus status) {
        System.out.println("Lager: Bestellstatus geändert zu '" + status + "' – Bestand prüfen.");
    }
}
