package abstract_factory;

public class SmsChannelFactory implements ChannelFactory {

    @Override
    public Message createMessage() {
        // TODO: Geben Sie eine neue SmsMessage zurück
        return null;
    }

    @Override
    public Sender createSender() {
        // TODO: Geben Sie einen neuen SmsSender zurück
        return null;
    }
}
