package builder;

public class Person {

    private final String name;
    private final String phone;
    private final String email;

    Person(String name, String phone, String email) {
        this.name  = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName()  { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', phone='" + phone + "', email='" + email + "'}";
    }
}
