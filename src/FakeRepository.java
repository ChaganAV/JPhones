import java.util.ArrayList;
import java.util.List;

public class FakeRepository implements Repositable<List<Contact>>{
    @Override
    public List<Contact> getData() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("8-987-99-61",new Person("Пушкин","Александр","Сергеевич")));
        contacts.add(new Contact("8-987-99-62",new Person("Грибоедов","Александр","Сергеевич")));
        contacts.add(new Contact("8-987-99-63",new Person("Толстой","Лев","Николаевич")));
        contacts.add(new Contact("8-987-99-64",new Person("Гоголь","Николай","Васильевич")));
        contacts.add(new Contact("8-987-99-65",new Person("Достоевский","Федор","Михайлович")));
        return contacts;
    }
}
