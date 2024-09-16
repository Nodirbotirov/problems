package pattern.parents;

public class App {
    public static void main(String[] args) {
        Parent parentOne = new Parent("Andrey");
        Parent parentTwo = new Parent("Ekaterina");

        Human childOne = new Child("Fedya");
        Human childTwo = new Child("Maxim");
        Human childThree = new Child("Nika");

        parentOne.addChild(childOne);
        parentOne.addChild(childTwo);
        parentOne.addChild(parentTwo);

        parentTwo.addChild(childThree);

        parentOne.say();
    }
}
