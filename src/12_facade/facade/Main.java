package facade;

public class Main {

    public static void main(String[] args) {
        OrderProcessingFacade shop = new OrderProcessingFacade();
        shop.placeOrder("ORD-001", 149.99);
    }
}
