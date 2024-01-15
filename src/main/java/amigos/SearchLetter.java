package amigos;

import java.lang.reflect.Method;

public class SearchLetter {
    public static void main(String[] args) {
        //Method
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }

    private static int countOccurrences(char[] letters, char searchLetter) {
        int count =0;
        for (char letter : letters) {
            if (letter == searchLetter){
                count++;
            }
        }
        return count;
    }


}
