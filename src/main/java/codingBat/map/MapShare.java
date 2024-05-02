package codingBat.map;

import java.util.Map;

public class MapShare extends MapBully{
    public static void main(String[] args) {

    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b",map.get("a"));
            map.remove("c");
        } else if (map.containsKey("b")) {
            map.remove("c");
            return map;
        }
        return map;
    }



}
