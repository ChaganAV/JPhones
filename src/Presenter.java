import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Presenter {
    FakeRepository contacts = new FakeRepository();
    MessagesRepository messagRepo = new MessagesRepository();
    Repository repository = new Repository(contacts);
    Messages messages = new Messages(messagRepo);
    public void mailing(){
        Map<String,String> mapMess = messages.getMessages();
        for(Contact contact: contacts.getData()){
            System.out.println(String.format("%s, %s",contact.getName(),contact.getPerson()));
            if(contact.getPhone() instanceof Messagable){
                String message = mapMess.get(contact.getPerson().getFirstname());
                ((Messagable) contact.getPhone()).getMessage(message);
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
