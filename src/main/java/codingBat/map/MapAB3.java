package codingBat.map;

import java.util.Map;

public class MapAB3 {
    public static void main(String[] args) {

    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (!map.containsKey("a")&&!map.containsKey("b")){
            return map;
        }
        if(!map.containsKey("a")){
            map.put("a", map.get("b"));
        }
        if (!map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        return map;
    }

}
