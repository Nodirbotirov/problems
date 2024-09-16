package pattern.proxy;

public class SimpleConnector implements Connector{

    private final Server server;

    public SimpleConnector(Server server) {
        System.out.println("Создается простой коннектор");
        this.server = server;
    }


    @Override
    public void uploadFile(String file) {
        server.putFile(file);
    }

    @Override
    public void receiveFile(String fileName) {
        server.takeFile(fileName);
    }
}
