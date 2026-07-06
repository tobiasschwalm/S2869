package factory_method;

public class SmsNotificationSender extends NotificationSender {

    @Override
    protected Notification createNotification() {
        // TODO: Eine neue SmsNotification zurückgeben
        return null;
    }

}
