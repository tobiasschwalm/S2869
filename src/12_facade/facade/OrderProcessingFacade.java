package facade;

public class OrderProcessingFacade {

    private WarehouseService warehouse = new WarehouseService();
    private PaymentService payment = new PaymentService();
    private ShippingService shipping = new ShippingService();

    public void placeOrder(String orderId, double amount) {
        // TODO: 1. Bestand im Lager reservieren
        // TODO: 2. Zahlung verarbeiten
        // TODO: 3. Versand beauftragen
    }

}
