package collection;

import java.util.*;

public class HashSetList {

    public static void main(String[] args) {
        String[] massiv = {"olma" ,"anor","shaftoli", "xurmo", "anor"};
        List<String> royhat = Arrays.asList(massiv);
        System.out.println(royhat);

        Set<String> toplam =  new HashSet<String>(royhat);
        System.out.println(toplam);


        HashMap<Integer, String> lugat =  new HashMap<Integer, String>();
        lugat.put(1, "bir");
        lugat.put(2, "ikki");
        lugat.put(3, "uch");
        lugat.put(4, "turt");
        lugat.put(5, "besh");
        lugat.put(5, "fife");

        System.out.println(lugat);
    }
    // dublikat saqlamaydi


}
