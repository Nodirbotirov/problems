package codingBat.string;

public class BobThere {
    public static void main(String[] args) {

    }

    public boolean bobThere(String str) {
        if (str.length() <3){
            return false;
        }else {
            for (int i = 0; i < str.length()-2; i++) {
                if ((str.charAt(i) == 'b') && (str.charAt(i+2)=='b')){
                    return true;
                }
            }
            return false;
        }
    }
}
