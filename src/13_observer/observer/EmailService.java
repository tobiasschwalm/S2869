package observer;

public class EmailService implements Observer {

    @Override
    public void update(OrderStatus status) {
        System.out.println("E-Mail: Kundenbenachrichtigung für Status '" + status + "' versenden.");
    }
}
