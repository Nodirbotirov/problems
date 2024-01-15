package amigos;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
//
        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
