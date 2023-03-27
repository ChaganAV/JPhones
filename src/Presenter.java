public class Presenter {
    FakeRepository contacts = new FakeRepository();
    Repository repository = new Repository(contacts);
    public void printContact(){
        for(Contact contact: contacts.getData()){
            System.out.println(String.format("%s, %s",contact.getName(),contact.getPerson()));
        }
    }
}
