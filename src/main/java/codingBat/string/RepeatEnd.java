package codingBat.string;

public class RepeatEnd {
    public static void main(String[] args) {
        String str = "Hello";
        int n = 3;
        System.out.println(repeatEnd(str, n));
    }




    public static String repeatEnd(String str, int n) {
        str = str.substring(str.length() - n);
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + str;
        }
        return s;
    }

}
