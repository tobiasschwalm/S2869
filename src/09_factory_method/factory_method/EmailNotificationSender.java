package factory_method;

public class EmailNotificationSender extends NotificationSender {

    @Override
    protected Notification createNotification() {
        // TODO: Eine neue EmailNotification zurückgeben
        return null;
    }
}
