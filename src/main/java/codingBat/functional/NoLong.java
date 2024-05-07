package codingBat.functional;

import java.util.ArrayList;
import java.util.List;

public class NoLong {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Asdf");
        strings.add("Bfsdf");
        strings.add("Cfsd");
        strings.add("Cfd");
        System.out.println(noLong(strings));
    }

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

}
