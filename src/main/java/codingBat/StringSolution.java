package codingBat;

public class StringSolution {
    public static void main(String[] args) {
        System.out.println(stringExplosion("Nodir"));
    }
    public static String stringExplosion(String str) {
        String result = "";
        for(int i = 0; i<str.length(); i++){
            result = result + str.substring(0, i+1);
        }
        return result;
    }

}
