package adapter;

public class PaymentAdapter implements PaymentProvider {

    private LegacyPaymentGateway legacy = new LegacyPaymentGateway();

    @Override
    public void pay(PaymentRequest request) {
        // TODO: Werte aus dem PaymentRequest entnehmen und
        //       die Methode des Legacy-Systems aufrufen
    }

}
