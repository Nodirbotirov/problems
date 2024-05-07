package codingBat.string;

public class XYBalance {
    public static void main(String[] args) {

    }



    public boolean xyBalance(String str) {
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == 'x') {
                return false;
            }
            if(str.charAt(i) == 'y') {
                return true;
            }
        }
        return true;
    }


}
