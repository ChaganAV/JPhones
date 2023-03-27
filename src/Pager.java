public class Pager extends Phone implements Messagable{
    private String message;

    public Pager(String name) {
        super(name);
    }
    public Pager(){
        super("Пэйджер");
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void getMessage() {
        System.out.println("Отправляю сообщение...");
    }
}
