package abstract_factory;

public class EmailChannelFactory implements ChannelFactory {

    @Override
    public Message createMessage() {
        return new EmailMessage();
    }

    @Override
    public Sender createSender() {
        return new EmailSender();
    }
}
