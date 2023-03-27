public class App {
    public void start(){
        System.out.println("== Сервис рассылки важной информации ==");
        Presenter presenter = new Presenter();
        presenter.printContact();
    }
}
