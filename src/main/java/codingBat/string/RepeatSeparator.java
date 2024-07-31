package codingBat.string;

public class RepeatSeparator {
    public static void main(String[] args) {
        String word = "Word";
        String sep = "E";
        int count = 3;
        System.out.println(repeatSeparator(word, sep, count));
    }


    public static String repeatSeparator(String word, String sep, int count) {
        if (count == 0)
            return "";

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < count - 1; i++) {
            result.append(word);
            result.append(sep);
        }

        return result.append(word).toString();


    }

}
