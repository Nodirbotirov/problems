package leetCode.task;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x == 0) return true;

        int left , right;
        left = 1;
        while (x / left > 9){
            left *= 10;
        }
        right = 1;
        while (left !=0){
                if (x / left % 10 != x / right % 10){
                return false;
            }
            left /= 10;
            right *= 10;
        }

        return true;
    }
}
