package builder;

public class PersonBuilder {

    private String name;
    private String phone;
    private String email;

    // TODO: Setzen Sie das Attribut name und geben Sie this zurück (fluent API)
    public PersonBuilder name(String name) {
        return this;
    }

    // TODO: Setzen Sie das Attribut phone und geben Sie this zurück (fluent API)
    public PersonBuilder phone(String phone) {
        return this;
    }

    // TODO: Setzen Sie das Attribut email und geben Sie this zurück (fluent API)
    public PersonBuilder email(String email) {
        return this;
    }

    // TODO: Erzeugen Sie ein neues Person-Objekt mit den gesammelten Werten
    public Person build() {
        return null;
    }

}
