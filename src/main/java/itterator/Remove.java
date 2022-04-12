package itterator;

import java.util.*;

public class Remove {
    public static void main(String[] args) {
        String[] massive1 = {"bir", "ikki", "uch", "to'rt"};
        List<String> toplam1 = new ArrayList<String>();
        List<String> royhat1 = new LinkedList<String>();
        for(String x: massive1)
            royhat1.add(x);

        String[] massive2 = {"besh", "olti", "yitti", "sakkiz"};
        List<String> toplam2 = new ArrayList<String>();
        List<String> royhat2 = new LinkedList<String>();
        for (String x: massive2)
            royhat2.add(x);

        for (int i=0; i<toplam1.size(); i++)
            System.out.printf("%s, ", toplam1.get(i));
        System.out.println();

        for (int i=0; i<toplam2.size(); i++)
            System.out.printf("%s, ", toplam2.get(i));
        System.out.println();

//        tahrirlash(toplam1, toplam2);
        royhat1.addAll(royhat2);
        royhatniKorsatish(royhat1);
        royhatAlmashtirish(royhat1);
        royhatniUchirish(royhat1, 3, 5);
        System.out.println(royhat1);



        for (int i=0; i<toplam1.size(); i++)
            System.out.printf("%s, ", toplam1.get(i));
    }

    //ikkalasida borini uchiradi
//    private static void tahrirlash(Collection<String> t1, Collection<String> t2){
//        Iterator<String> it = t1.iterator();
//        while (it.hasNext())
//            if (t2.contains(it.next()))
//                it.remove();
//    }

    private static void royhatniKorsatish(List<String> royhat){
        for (String x: royhat)
            System.out.printf("%s, ", x);
        System.out.println();
    }

    private static void royhatniUchirish(List<String> royhat, int dan, int gacha){
        royhat.subList(dan, gacha).clear();
    }

    private static void royhatAlmashtirish(List<String> royhat){
        ListIterator<String> iteratorimiz = royhat.listIterator(royhat.size());
        while (iteratorimiz.hasPrevious())
            System.out.printf("%s, ", iteratorimiz.previous());
        System.out.println();
    }
}
