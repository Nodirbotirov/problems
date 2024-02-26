package collection;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        /*
        LIST INTERFACE BO'LADI,
        LIST 3 GA BO'LINADI ULAR:
        ARRAYLIST,
        LINKEDLIST
        */
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();

        numbers.add(44);
        numbers.add(11);
        numbers.add(1);
        numbers.add(1010);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
        System.out.println(numbers.contains(1010));
        System.out.println(numbers.equals(numbers));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.remove(2));
        System.out.println(numbers);

        numbers.removeIf(number -> number.equals(44));
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 11)
                numbers.remove(i);
        }
        System.out.println(numbers);
        System.out.println("numbers1");

        numbers1.addAll(numbers);
        System.out.println(numbers1);
        numbers1.add(156);
        numbers1.add(157);

        numbers1.removeAll(numbers);
        System.out.println(numbers1);

        List<String> myWishes = new LinkedList<>();
        myWishes.add("go to Germany");
        myWishes.add("go to Usa");
        myWishes.add("to be Senior developer");
        myWishes.add("to be Senior developer");
        myWishes.add("to be Senior developer");
        System.out.println(myWishes);
        System.out.println("*******************");
        Set<String> yourDreams = new HashSet<>();
        yourDreams.add("go to Germany");
        yourDreams.add("go to Usa");
        yourDreams.add("to be Senior developer");
        yourDreams.add("to be Senior developer");
        yourDreams.add("to be Senior developer");
        System.out.println(yourDreams);

        Set<String> passwordObject = new HashSet<>();
        Set<Integer> uniqueObject = new TreeSet<>();
        int passwords[] = new int[]{1,56,4,5,1,3,15,4,1,5,32,1,2,3,4,78,9,8,7,9,7,57,9,7};
        for (Integer s: passwords) {
            passwordObject.add(s.toString());
            uniqueObject.add(s);
            System.out.println(s);
        }
        passwordObject.addAll(myWishes);
        System.out.println(passwordObject);
        System.out.println(uniqueObject);
    }
}
