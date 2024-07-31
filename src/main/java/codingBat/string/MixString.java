package codingBat.string;

public class MixString {
    public static void main(String[] args) {
        String a = "dasaa";
        String b = "Saa";
        System.out.println(mixString(a,b));
    }

    public static String mixString(String a, String b) {
        String added = "";
        int minimum = 0;
        if(a.length() < b.length()) {
            minimum = a.length();
            for (int i = 0; i < minimum; i++) {
                added += "" + a.charAt(i) + b.charAt(i);
            }
            return added + b.substring(a.length());
        } else {
            minimum = b.length();
            for (int i = 0; i < minimum; i++) {
                added += "" + a.charAt(i) + b.charAt(i);
            }
            System.out.println(added);
            return added + a.substring(b.length());
        }
    }

}
