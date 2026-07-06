package observer;

public class AccountingService implements Observer {

    @Override
    public void update(OrderStatus status) {
        System.out.println("Buchhaltung: Statusänderung '" + status + "' buchen.");
    }
}
