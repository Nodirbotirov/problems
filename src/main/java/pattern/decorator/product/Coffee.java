package pattern.decorator.product;

public class Coffee extends AbstractProduct{

    public int getVolume(){
        return 250;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
