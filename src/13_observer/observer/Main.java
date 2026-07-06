package observer;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        order.attach(new WarehouseService());
        order.attach(new EmailService());
        order.attach(new AccountingService());

        order.setStatus(OrderStatus.BEZAHLT);
        order.setStatus(OrderStatus.VERSANDT);
    }
}
