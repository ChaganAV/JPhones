import java.util.ArrayList;
import java.util.List;

public class FakeRepository implements Repositable<List<Contact>>{
    @Override
    public List<Contact> getData() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("8-987-99-61",new Person("Пушкин","Александр","Сергеевич"),new Pager()));
        contacts.add(new Contact("8-987-99-62",new Person("Грибоедов","Александр","Сергеевич"),new PhoneButton()));
        contacts.add(new Contact("8-987-99-63",new Person("Толстой","Лев","Николаевич"),new PhoneButton()));
        contacts.add(new Contact("8-987-99-64",new Person("Гоголь","Николай","Васильевич"),new SmartPhone()));
        contacts.add(new Contact("8-987-99-65",new Person("Достоевский","Федор","Михайлович"),new Pager()));
        return contacts;
    }
}
