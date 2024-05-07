package codingBat.string;

public class XyzThere {
    public static void main(String[] args) {

    }

    public boolean xyzThere(String str) {

        str = str.replace(".xyz", "");
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("xyz")){
                return true;
            }
        }

        return false;
    }

}
