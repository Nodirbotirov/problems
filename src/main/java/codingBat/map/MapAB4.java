package codingBat.map;

import java.util.Map;

public class MapAB4 {
    public static void main(String[] args) {

    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a")&& map.containsKey("b")){
            if (map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            }
            if (map.get("a").length() < map.get("b").length()){
                map.put("c", map.get("b"));
            }
            if (map.get("a").length() == map.get("b").length()){
                map.put("a", "");
                map.put("b", "");
            }

        }

      return map;
    }

}
