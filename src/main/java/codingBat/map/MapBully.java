package codingBat.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapBully {
    public static void main(String[] args) {
        String stringjon = generateString(new Random(),"fdggrthytj", 8);

        Map<String, String> map = new HashMap<>();
        map.put("a", stringjon);
        map.put("b", stringjon);
        map.put("c", stringjon);
        System.out.println(mapBully(map));
    }



    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }


    public static String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
