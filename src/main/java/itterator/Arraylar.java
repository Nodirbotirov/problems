package itterator;

import java.util.*;

public class Arraylar {
    public static void main(String[] args) {
        int[] massive1 = {6,3,1,7,9,5,-8,2,0,4,-1,8};
        System.out.println(Arrays.toString(massive1));
        Arrays.sort(massive1);
        System.out.println(Arrays.toString(massive1));
        System.out.println(Arrays.binarySearch(massive1, 4));
        int[] massive2 = Arrays.copyOf(massive1, 4);
        int[] massive4 = Arrays.copyOf(massive1, massive1.length);
        System.out.println(Arrays.toString(massive2));
        Arrays.fill(massive4, 0, 3, 0);
        System.out.println(Arrays.toString(massive4));
        int[] massive3 = Arrays.copyOfRange(massive1, 4, 6);
        System.out.println(Arrays.toString(massive3));
        System.out.println(Arrays.equals(massive1, massive4));

        System.out.println("**************");
        String[] massiv = {"bir","ikki","uch","to'rt"};
        LinkedList<String> toplam = new LinkedList<String>(Arrays.asList(massiv));
        System.out.println(toplam);
        toplam.add("besh");
        System.out.println(toplam);
        toplam.addFirst("null");
        System.out.println(toplam);
//        massiv = toplam.toArray(new String[toplam.size()]);
        massiv = toplam.toArray(new String[0]);
        System.out.println(Arrays.toString(massiv));
        System.out.println("**************");
    }
}
