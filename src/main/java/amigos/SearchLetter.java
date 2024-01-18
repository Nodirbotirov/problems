package amigos;

import java.lang.reflect.Method;

public class SearchLetter {
    public static void main(String[] args) {
        //Method
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        char[] numbers = {'1', '1', '5', '8', '5', '1'};
        int count = countOccurrences(letters, 'D');
        int count1 = countOccurrences(numbers, '5');
        System.out.println(count);
        System.out.println(count1);
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
