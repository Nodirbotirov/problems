package codingBat.functional;

import java.util.List;

public class No34 {
    public static void main(String[] args) {

    }

    public List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

}
