package facade;

public class PaymentService {

    public void processPayment(String orderId, double amount) {
        System.out.println("Zahlung: " + amount + " EUR für Bestellung " + orderId + " verarbeitet.");
    }
}
