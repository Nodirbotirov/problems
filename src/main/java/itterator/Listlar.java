package itterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listlar {
    public static void main(String[] args) {
        String[] massiv = {"zoopark", "antiqa", "yaxshi", "vaxshiy", "baqlajon"};
        List<String> toplam = Arrays.asList(massiv);
        System.out.println(toplam);

        Collections.sort(toplam);
        System.out.println(toplam);

        toplam.sort(Collections.reverseOrder());
        System.out.println(toplam);


        System.out.println("***************");
        System.out.println();
        System.out.println();


        Character[] massive = {'a', 'z', 'e', 'u', 'n'};
        List<Character> toplams = Arrays.asList(massive);
        System.out.println(toplams);

        Collections.reverse(toplams);
        System.out.printf("revernse bolgandan kn: %s\n", toplams);

        Character[] yangiMassiv = new Character[5];
        List<Character> toplamNushasi = Arrays.asList(yangiMassiv);
        Collections.copy(toplamNushasi, toplams);
        System.out.printf("Nusha olingandan kn: %s\n", toplamNushasi);

        Collections.fill(toplams, 'A');
        System.out.println(toplams);


    }
}
