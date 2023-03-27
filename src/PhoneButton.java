public class PhoneButton extends Phone implements Messagable,Callable{
    private String message;

    public PhoneButton() {
        super("Кнопочный телефон");
    }

    @Override
    public void getMessage(String text) {
        System.out.println(text);
    }

    @Override
    public void calling() {
        System.out.println("Пошел звонок...");
    }
}
