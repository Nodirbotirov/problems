package collection;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intMassiv = {1,2,3,4};
        Character[] charMassive = {'j','a','v','a'};
        massivenikursat(intMassiv);
        massivenikursat(charMassive);

        System.out.println(maximum(1,2,4,9,8,3,8,6,8161,0,-78));
        System.out.println(maximum('a','d','t','e','u','v','s','q','h','z'));
        System.out.println(maximum("Nodir","Bobur","Umed","DJone","Zyod"));
    }

    private static <T extends Comparable<T>> T maximum(T ... qiymat){
        Arrays.sort(qiymat);
        return qiymat[qiymat.length - 1];
    }

    //GENERIC TYPE
    private static <T> void massivenikursat(T[] massive){
        for (T x: massive)
            System.out.printf("%s ", x);
        System.out.println();
    }

    //ODDIY TYPE
//    private static void massivenikursat(Integer[] massive){
//        for (Integer x: massive)
//            System.out.printf("%s ", x);
//        System.out.println();
//    }


}
