package codingBat.warmup;

public class AltPairs {
    public static void main(String[] args) {

    }

    public static String altPairs(String str) {
        String sn = "";
        for (int i = 0; i < str.length(); i++) {
            sn = str.substring(0, 1) + str.substring(4, 5) + str.substring(8, 9);
        }
        return sn;
    }

}
