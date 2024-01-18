package codingBat;

public class CountXxx {
    public static void main(String[] args) {
        String www = "sxxxxxxxx";
        countXX(www);
    }
    static int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        System.out.println(count);
        return count;
    }
}