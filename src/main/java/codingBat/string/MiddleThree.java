package codingBat.string;

public class MiddleThree {
    public static void main(String[] args) {
        String str = "thdfgdree";
        System.out.println(middleThree(str));
    }

    public static String middleThree(String str) {

        int mid = str.length() / 2;
        return str.substring(mid - 1, mid +2);
    }
}
