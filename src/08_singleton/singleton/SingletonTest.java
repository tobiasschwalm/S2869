package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class SingletonTest {

    @Test void instanceIsNotNull() {
        assertNotNull(Counter.getInstance());
    }

    @Test void alwaysReturnsSameInstance() {
        assertSame(Counter.getInstance(), Counter.getInstance());
    }

    @Test void sharedStateBetweenReferences() {
        Counter a = Counter.getInstance();
        Counter b = Counter.getInstance();
        int before = a.getValue();
        a.increment();
        a.increment();
        b.increment();
        assertEquals(before + 3, b.getValue());
    }

    @Test void constructorIsPrivate() throws NoSuchMethodException {
        Constructor<Counter> ctor = Counter.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(ctor.getModifiers()),
                "Konstruktor muss private sein");
    }
}
