package codingBat.string;

public class String2 {
    public static void main(String[] args) {

    }

    public boolean catDog(String str) {
        int dogCount = 0;
        int catCount = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).equals("dog")) {
                dogCount++;
            }
            if (str.substring(i, i+3).equals("cat")) {
                catCount++;
            }
        }
        if (dogCount == catCount) {
            return true;
        }else return false;
    }

}
