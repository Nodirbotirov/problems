package codingBat.warmup;

public class StringX {
    public static void main(String[] args) {

    }

    public static String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }return result;
    }
}
