package codingBat;

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Nodir"));
    }
    public static String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i<str.length(); i++){
            result = result + str.substring(0, i+1);
        }
        return result;
    }

}
