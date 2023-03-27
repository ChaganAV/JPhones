public class Pager extends Phone implements Messagable{
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void getMessage() {
        System.out.println(String.format("Отправляю сообщение %s...",message));
    }
}
