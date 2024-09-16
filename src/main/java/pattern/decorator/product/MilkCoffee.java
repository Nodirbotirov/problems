package pattern.decorator.product;

public class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getVolume() {
        return super.getVolume() +150;
    }

    @Override
    public int getCost() {
        return super.getCost() +50;
    }
}
