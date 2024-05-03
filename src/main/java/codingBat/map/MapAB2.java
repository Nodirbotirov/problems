package codingBat.map;

import java.util.Map;
import java.util.Objects;

public class MapAB2 {
    public static void main(String[] args) {

    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (Objects.equals(map.get("a"), map.get("b"))){
            map.remove("a");
            map.remove("b");
            return map;
        }

        return map;
    }
}
