package test;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRandomWords(40)));
        System.out.println("*************************");
        System.out.println("");
        System.out.println("");
        System.out.println("*************************");
        System.out.println(Arrays.toString(generateRandomWords(40)));
    }

    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    String generateRandomWord(int wordLength) {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) { // For each letter in the word
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }
}
