package pattern.proxy;

public class ProxyConnector implements Connector{
    private SimpleConnector connector;

    @Override
    public void uploadFile(String file) {
        init();
        if (validate(file)){
            connector.receiveFile(file);
        }else {
            throw new IllegalAccessError();
        }

    }

    @Override
    public void receiveFile(String fileName) {
        init();
        if (validate(fileName)){
            connector.receiveFile(fileName);
        }else {
            throw new IllegalAccessError();
        }
    }

    private void init(){
        if (connector == null) {
            connector = new SimpleConnector(new Server());
        }
    }
    private boolean validate(String file) {
        return !file.isEmpty();
    }
}
