package builder;

public class Main {

    public static void main(String[] args) {
        Person p1 = new PersonBuilder()
                .name("John")
                .phone("+49111222333")
                .build();

        Person p2 = new PersonBuilder()
                .name("Alice")
                .email("alice@example.com")
                .build();

        Person p3 = new PersonBuilder()
                .name("Bob")
                .phone("+49444555666")
                .email("bob@example.com")
                .build();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
