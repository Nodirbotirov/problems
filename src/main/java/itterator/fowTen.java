package itterator;

import java.util.LinkedList;
import java.util.Stack;

public class fowTen {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.offer("bir"); ll.offer("ikki");
        ll.offer("uch"); ll.offer("turt");

        System.out.println(ll);

        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());


        Stack<String> stek = new Stack<String>();

        stekniChiqar(stek);
        stek.push("birinchi piyola");
        stekniChiqar(stek);
        stek.push("ikkinchi piyola");
        stekniChiqar(stek);
        stek.push("uchinchi piyola");
        stekniChiqar(stek);
        stek.push("turtinchi piyola");
        stekniChiqar(stek);
    }

    private static void stekniChiqar(Stack<String> s){
        if (s.isEmpty())
            System.out.println("Sizning stekingniz bo'm bo'sh");
        else System.out.printf("%s Eng Tepada\n", s);
    }
}
