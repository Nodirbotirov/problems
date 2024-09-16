package pattern.decorator.product;

public class ChocolateCookie extends CookieDecorator{


    public ChocolateCookie(Cookie decoratedCookie) {
        super(decoratedCookie);
    }

    @Override
    public int getWeight() {
        return super.getWeight() + 15;
    }

    @Override
    public int getCost() {
        return super.getCost() + 70;
    }
}
