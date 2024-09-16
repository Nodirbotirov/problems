package pattern.decorator.product;

public class CookieDecorator extends Cookie{

    protected Cookie decoratedCookie;

    public CookieDecorator(Cookie decoratedCookie) {
        this.decoratedCookie = decoratedCookie;
    }

    @Override
    public int getWeight() {
        return decoratedCookie.getWeight();
    }

    @Override
    public int getCost() {
        return decoratedCookie.getCost();
    }
}
