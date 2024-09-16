package pattern.factory;

public class Processor {
    private final String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
