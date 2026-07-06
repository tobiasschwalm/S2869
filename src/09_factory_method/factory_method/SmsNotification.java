package factory_method;

public class SmsNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS an " + recipient + ": " + message);
    }
}
