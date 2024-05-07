package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        System.out.println(addStar(strings));
    }

    public static List<String> addStar(List<String> strings) {

        return strings.stream()
                .map(n -> n + "*")
                .collect(Collectors.toList());

    }

}
