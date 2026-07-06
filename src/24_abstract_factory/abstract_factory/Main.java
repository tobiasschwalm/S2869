package abstract_factory;

public class Main {

    public static void main(String[] args) {
        sendNotification(new EmailChannelFactory(), "kunde@beispiel.de",  "Ihre Bestellung ist eingetroffen.");
        sendNotification(new SmsChannelFactory(),   "+49123456789",       "Ihre Bestellung ist eingetroffen.");
    }

    static void sendNotification(ChannelFactory factory, String to, String content) {
        Message message = factory.createMessage();
        Sender  sender  = factory.createSender();
        sender.send(to, message.format(content));
    }
}
