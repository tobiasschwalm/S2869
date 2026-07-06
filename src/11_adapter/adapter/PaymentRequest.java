package adapter;

public class PaymentRequest {

    private double amount;
    private String orderId;

    public PaymentRequest(double amount, String orderId) {
        this.amount = amount;
        this.orderId = orderId;
    }

    public double getAmount() { return amount; }
    public String getOrderId() { return orderId; }
}
