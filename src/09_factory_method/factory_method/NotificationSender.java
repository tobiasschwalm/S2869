package factory_method;

public abstract class NotificationSender {

    public final void notifyCustomer(String recipient, String message) {
        Notification notification = createNotification();
        notification.send(recipient, message);
    }

    protected abstract Notification createNotification();
}
