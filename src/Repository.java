import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Contact> contacts = new ArrayList<>();

    public Repository(Repositable<List<Contact>> repositable) {
        this.contacts = repositable.getData();
    }
}
