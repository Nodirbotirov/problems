package codingBat;

public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("NNooddiirr"));
    }
    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i<str.length(); i+=2){
            result = result + str.substring(i, i+1);
            System.out.println(result);
        }
        return result;

    }
}
