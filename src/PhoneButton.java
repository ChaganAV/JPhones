public class PhoneButton extends Phone implements Messagable,Callable{
    private String message;

    public PhoneButton() {
        super("Кнопочный телефон");
    }

    @Override
    public void getMessage( ) {
        System.out.println("Отправляю текстовое сообщение...");
    }

    @Override
    public void calling() {
        System.out.println("Пошел звонок...");
    }
}
