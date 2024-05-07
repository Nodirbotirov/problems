package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Lower {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Asdf");
        strings.add("Bfsdf");
        strings.add("Cfsd");
        System.out.println(lower(strings));
    }

    public static List<String> lower(List<String> strings) {
        return strings.stream()
                .map(s -> s.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());
    }

}
