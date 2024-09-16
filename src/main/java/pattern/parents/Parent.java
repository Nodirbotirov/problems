package pattern.parents;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Human{
    private final String name;
    private List<Human> children;

    public Parent(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("I am a parent! My name is " + name);
        for (Human person: children) {
            person.say();
        }
    }
    public void addChild(Human human) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(human);

    }
}
