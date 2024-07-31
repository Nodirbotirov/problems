package codingBat.string;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 1;
        System.out.println(prefixAgain(str, n));
    }


    public static boolean prefixAgain(String str, int n) {

        char l = str.charAt(n-1);
        System.out.println(l);

        for (int i = n; i < str.length(); i++) {
            if (str.charAt(i) == l)
            return true;
        }
        return false;
    }
}
