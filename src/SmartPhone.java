public class SmartPhone extends Phone implements Messagable,Callable,Mediable{
    public SmartPhone(String name) {
        super(name);
    }

    public SmartPhone(){
        super("Смартофон");
    }

    @Override
    public void calling() {
        System.out.println("Пошел звонок...");
    }

    @Override
    public void getVideo() {
        System.out.println("Отправляем видео-сообщение...");;
    }

    @Override
    public void getMessage() {
        System.out.println("Отправляет текстовое сообщение...");
    }
}
