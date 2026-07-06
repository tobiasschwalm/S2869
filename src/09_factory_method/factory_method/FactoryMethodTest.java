package factory_method;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test void emailSenderCreatesEmailNotification() {
        EmailNotificationSender sender = new EmailNotificationSender();
        Notification n = sender.createNotification();
        assertNotNull(n, "createNotification() darf nicht null zurückgeben");
        assertInstanceOf(EmailNotification.class, n);
    }

    @Test void smsSenderCreatesSmsNotification() {
        SmsNotificationSender sender = new SmsNotificationSender();
        Notification n = sender.createNotification();
        assertNotNull(n, "createNotification() darf nicht null zurückgeben");
        assertInstanceOf(SmsNotification.class, n);
    }

    @Test void sendersReturnDistinctTypes() {
        assertFalse(new EmailNotificationSender().createNotification() instanceof SmsNotification);
        assertFalse(new SmsNotificationSender().createNotification() instanceof EmailNotification);
    }

    @Test void notifyCustomerRunsWithoutException() {
        assertDoesNotThrow(() ->
            new EmailNotificationSender().notifyCustomer("test@test.de", "Hallo"));
        assertDoesNotThrow(() ->
            new SmsNotificationSender().notifyCustomer("+491234", "Hallo"));
    }
}
