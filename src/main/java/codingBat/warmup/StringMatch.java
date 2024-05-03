package codingBat.warmup;

import codingBat.map.MapBully;

import java.util.Random;

public class StringMatch extends MapBully {
    public static void main(String[] args) {
        String a = generateString(new Random(),"abc", 8);
        String b = generateString(new Random(),"abc", 8);
        System.out.println(a);
        System.out.println(b);
        stringMatch(a,b);
    }

    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)){
                count++;
                System.out.println(count);
            }
        }

        return count;
    }

}
