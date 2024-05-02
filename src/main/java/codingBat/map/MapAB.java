package codingBat.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapAB extends MapBully{
    public static void main(String[] args) {
        String stringjon = generateString(new Random(),"fdggrthytj", 8);

        Map<String, String> map = new HashMap<>();
        map.put("a", stringjon);
        map.put("b", stringjon);
        System.out.println(mapAB(map));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            String tmp = map.get("a")+map.get("b");
            map.put("ab", tmp);
        }

        return map;
    }


}