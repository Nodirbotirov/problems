package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Asdf");
        strings.add("Bfsdf");
        strings.add("Cfsd");
        System.out.println(moreY(strings));
    }

    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

}
