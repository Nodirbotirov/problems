package pattern.parents;

public class Child extends Human{
    private final String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("I am Child! My name is " + name);
    }
}
