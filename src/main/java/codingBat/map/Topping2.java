package codingBat.map;

import java.util.Map;

public class Topping2 {
    public static void main(String[] args) {

    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        } if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}
