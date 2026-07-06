package abstract_factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class AbstractFactoryTest {

    static String capture(Runnable r) {
        PrintStream orig = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buf));
        try { r.run(); } finally { System.setOut(orig); }
        return buf.toString();
    }

    @Test void smsMessageFormatsContent() {
        Message msg = new SmsMessage();
        assertNotNull(msg.format("Hallo"), "format() darf nicht null zurückgeben");
        assertTrue(msg.format("Hallo").contains("Hallo"), "Inhalt fehlt in: " + msg.format("Hallo"));
    }

    @Test void smsSenderOutputsRecipientAndMessage() {
        String out = capture(() -> new SmsSender().send("+49123", "Test"));
        assertTrue(out.contains("+49123"), "Empfänger fehlt in: " + out);
        assertTrue(out.contains("Test"),   "Nachricht fehlt in: " + out);
    }

    @Test void smsFactoryReturnsCorrectTypes() {
        ChannelFactory factory = new SmsChannelFactory();
        assertInstanceOf(SmsMessage.class, factory.createMessage());
        assertInstanceOf(SmsSender.class,  factory.createSender());
    }

    @Test void emailFactoryReturnsCorrectTypes() {
        ChannelFactory factory = new EmailChannelFactory();
        assertInstanceOf(EmailMessage.class, factory.createMessage());
        assertInstanceOf(EmailSender.class,  factory.createSender());
    }
}
