package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        System.out.println((copies3(strings)));
    }

    public static List<String> copies3(List<String> strings) {

        return strings.stream()
                .map(s -> s+s+s)
                .collect(Collectors.toList());
    }
}
