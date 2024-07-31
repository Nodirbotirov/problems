package leetCode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" vfsdf day "));
    }


    public static int lengthOfLastWord(String s) {
            s = s.trim();
        if (s.isEmpty() || s.length() == 1 ) {
            return s.length();
        }
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));
        System.out.println(s1.length);

        if (s1.length == 1){
            return s1[0].length();
        }
        return s1[s1.length -1].length();

//            for (int i = s.length() - 1; i >= 0; i--) {
//                if (s.charAt(i) == ' ' || i ==0) {
//                    String lastWord = s.substring(i, s.length()-1);
//                    return lastWord.length();
//                }
//            }

//        int cnt = 0;
//        int br = 0;
//        int len = s.length() - 1;
//        for (int i = len; i >= 0; i--) {
//            if(s.charAt(i) != ' '){
//                cnt++;
//            }if(s.charAt(i) != ' ' && i < len)
//                break;
//            //if (s.charAt(i) == ' ' || i ==0 ) {
////                String lastWord = s.substring(i, s.length()-1);
////                return lastWord.length();
////            }
//        }
//            return cnt;
    }
}
