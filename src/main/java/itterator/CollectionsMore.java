package itterator;
import java.util.*;

public class CollectionsMore {
    public static void main(String[] args) {
        String[] massiv = {"olma", "anor", "nok", "xurmo"};
        List<String> toplam1 = Arrays.asList(massiv);
        ArrayList<String> toplam2 = new ArrayList<String>();
        toplam2.add("Chicago");
        toplam2.add("California");
        toplam2.add("San Diego");
        toplam2.add("San Francisco");
        System.out.println(toplam2);

        Collections.addAll(toplam2, massiv);
        System.out.println(toplam2);

        toplam2.add("anor");
        System.out.println(Collections.frequency(toplam2, "anor"));

        boolean has = Collections.disjoint(toplam1, toplam2);
        if (has)
            System.out.println("has not");
        System.out.println("rite");

        Integer[] massive = {1, 5, 6, 8, 0, -7, -43, 99, -1, 13 };
        List<Integer> toplam = Arrays.asList(massive);
        System.out.println(toplam);
        System.out.println(Collections.min(toplam));
        System.out.println(Collections.max(toplam));
        Collections.sort(toplam);
        System.out.println(toplam);
        System.out.println(Collections.binarySearch(toplam, 8));
        Collections.swap(toplam, 8, 5);
        System.out.println(toplam);
        Collections.shuffle(toplam);
        System.out.println(toplam);
        Collections.replaceAll(toplam,5, 13);
        System.out.println(toplam);
        Collections.replaceAll(toplam,13, 0);
        System.out.println(toplam);
    }
}
