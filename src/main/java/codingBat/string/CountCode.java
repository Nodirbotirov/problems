package codingBat.string;

public class CountCode {
    public static void main(String[] args) {

    }
    public int countCode(String str) {
        int counter = 0;

        for(int i = 0; i < str.length()-3; i++){
            if (str.substring(i, i+2).equals("co") && str.charAt(i+3) == 'e')
                counter ++;
        }
        return counter;
    }

}
