package codingBat.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoX {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Axdf");
        strings.add("Bfxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxsdf");
        strings.add("Cfsd");
        System.out.println(noX(strings));

    }

    public static List<String> noX(List<String> strings) {


        return strings.stream()
                .map(s -> s.replaceAll("x", "")).collect(Collectors.toList());



//        return strings.stream()
////                .filter(item->!item.contains("x"))
//                .map(s -> {
//                    if (s.contains("x")) {
//                        return Arrays.stream(s.split("")).filter(x->!x.equals("x")).collect(Collectors.joining("-"));
//                    } else {
//                        return s;
//                    }
//                }).collect(Collectors.toList());


        //        strings.removeIf(s -> s.contains("x"));
//        return strings;
    }


}
