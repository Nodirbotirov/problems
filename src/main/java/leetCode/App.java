package leetCode;

import leetCode.task.Palindrome;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean p = Palindrome.isPalindrome(sc.nextInt());
        System.out.println(p ? "Yes" : "No");
    }
}