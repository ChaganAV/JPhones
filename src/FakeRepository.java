import java.util.ArrayList;
import java.util.List;

public class FakeRepository implements Repositable<List<Contact>>{
    @Override
    public List<Contact> getData() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("8-987-99-61",new Person("Пушкин","Александр","Сергеевич"),new Pager()));
        contacts.add(new Contact("8-987-99-62",new Person("Шекспир","Вилли"),new PhoneButton()));
        contacts.add(new Contact("8-987-99-63",new Person("Толстой","Лев","Николаевич"),new PhoneButton()));
        contacts.add(new Contact("8-987-99-64",new Person("Чернышевский","Николай","Гаврилович"),new SmartPhone()));
        contacts.add(new Contact("8-987-99-65",new Person("Гоголь","Николай","Васильевич"),new Pager()));
        contacts.add(new Contact("8-987-99-66",new Person("Дарвин","Чарлз"),new Pager()));
        return contacts;
    }
}
