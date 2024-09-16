package pattern.decorator.product;

public abstract class CoffeeDecorator extends Coffee{
    private Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public int getVolume() {
        return decoratedCoffee.getVolume();
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost();
    }
}
