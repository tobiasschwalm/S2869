package factory_method;

public class EmailNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        System.out.println("E-Mail an " + recipient + ": " + message);
    }
}
