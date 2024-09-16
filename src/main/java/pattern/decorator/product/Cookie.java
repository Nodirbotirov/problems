package pattern.decorator.product;

public class Cookie extends AbstractProduct{

    public int getWeight() {
        return 100;
    }

    @Override
    public int getCost() {
        return 120;
    }
}
