package pattern.proxy;

public class Server {

    public void putFile(String file) {
        System.out.println("Кладём файл!");
    }

    public void takeFile(String fileName){
        System.out.println("Возьмите ваш файл");
    }
}
