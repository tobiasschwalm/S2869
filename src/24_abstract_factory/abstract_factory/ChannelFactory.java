package abstract_factory;

public interface ChannelFactory {
    Message createMessage();
    Sender createSender();
}
