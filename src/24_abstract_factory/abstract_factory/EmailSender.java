package abstract_factory;

public class EmailSender implements Sender {

    @Override
    public void send(String to, String message) {
        System.out.println("E-Mail an " + to + ":\n" + message);
    }
}
