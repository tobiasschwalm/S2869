package adapter;

public class LegacyPaymentGateway {

    public void processPayment(double amount, String reference) {
        System.out.println("Legacy-System: Zahlung " + amount + " EUR mit Referenz " + reference + " ausgeführt.");
    }
}
