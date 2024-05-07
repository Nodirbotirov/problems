package codingBat.functional;

import java.util.List;

public class NoYY {
    public static void main(String[] args) {

    }

    public List<String> noYY(List<String> strings) {

        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }


}
