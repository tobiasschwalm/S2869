package adapter;

public class Main {

    public static void main(String[] args) {
        PaymentProvider provider = new PaymentAdapter();
        provider.pay(new PaymentRequest(99.90, "ORD-042"));
    }
}
