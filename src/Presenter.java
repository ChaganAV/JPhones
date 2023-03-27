import java.util.ArrayList;
import java.util.List;

public class Presenter {
    FakeRepository contacts = new FakeRepository();
    Repository repository = new Repository(contacts);
    public void mailing(){
        for(Contact contact: contacts.getData()){
            System.out.println(String.format("%s, %s",contact.getName(),contact.getPerson()));
            if(contact.getPhone() instanceof Messagable){
                ((Messagable) contact.getPhone()).getMessage();
            }
            if(contact.getPhone() instanceof Callable){
                ((Callable) contact.getPhone()).calling();
            }
            if(contact.getPhone() instanceof Mediable){
                ((Mediable) contact.getPhone()).getVideo();
            }
        }
    }
}
