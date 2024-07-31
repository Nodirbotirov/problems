package codingBat.string;

public class RepeatFront {
    public static void main(String[] args) {
        String str = "Hello";
        int n = 3;
        System.out.println(repeatFront(str, n));
    }


    public static String repeatFront(String str, int n) {
        String s = "";
        for (int i = 0; i < n; n--) {
            s += str.substring(0, n);;
        }

        return s;
    }
}
