package factory_method;

public class Main {

    public static void main(String[] args) {
        NotificationSender emailSender = new EmailNotificationSender();
        emailSender.notifyCustomer("kunde@beispiel.de", "Ihre Bestellung wurde versandt.");

        NotificationSender smsSender = new SmsNotificationSender();
        smsSender.notifyCustomer("+49123456789", "Ihre Bestellung wurde versandt.");
    }
}
