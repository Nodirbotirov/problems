package pattern.proxy;

public class App {
    public static void main(String[] args) {
        Connector connector = new ProxyConnector();

        connector.receiveFile("cute.jpg");

        connector.uploadFile("cute.gif");

        connector.receiveFile("");
    }
}
