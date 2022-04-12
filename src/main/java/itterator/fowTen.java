package itterator;

import java.util.LinkedList;

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
    }
}
