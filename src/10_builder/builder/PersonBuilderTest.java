package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {

    @Test void buildsCompleteObject() {
        Person p = new PersonBuilder().name("Alice").phone("+49111222333").email("alice@example.com").build();
        assertNotNull(p);
        assertEquals("Alice", p.getName());
        assertEquals("+49111222333", p.getPhone());
        assertEquals("alice@example.com", p.getEmail());
    }

    @Test void buildsWithoutOptionalPhone() {
        Person p = new PersonBuilder().name("Bob").email("bob@example.com").build();
        assertEquals("Bob", p.getName());
        assertNull(p.getPhone());
        assertEquals("bob@example.com", p.getEmail());
    }

    @Test void fluentSettersReturnThis() {
        PersonBuilder b = new PersonBuilder();
        assertSame(b, b.name("X"));
        assertSame(b, b.phone("+49000"));
        assertSame(b, b.email("x@x.de"));
    }

    @Test void independentBuilderInstancesAreDifferentObjects() {
        Person a = new PersonBuilder().name("A").build();
        Person b = new PersonBuilder().name("B").build();
        assertNotSame(a, b);
        assertEquals("A", a.getName());
        assertEquals("B", b.getName());
    }
}
