package abstract_factory;

public class EmailMessage implements Message {

    @Override
    public String format(String content) {
        return "Betreff: Benachrichtigung\n\n" + content;
    }
}
