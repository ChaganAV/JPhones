public class Contact {
    private String name;
    private Person person;
    private Phone phone;
    public Contact(){}
    public Contact(String name, Person person, Phone phone) {
        this.name = name;
        this.person = person;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
