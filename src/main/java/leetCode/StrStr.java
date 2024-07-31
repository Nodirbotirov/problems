package leetCode;

public class StrStr {
    public static void main(String[] args) {

    }

    public static int strStr(String haystack, String needle) {
        int index = 0;
            for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
                if (haystack.substring(i,j).equals(needle)){
                    return i;
                }
            }
            return -1;
    }
}
