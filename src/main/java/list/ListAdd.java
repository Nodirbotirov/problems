package list;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(101);
        numbers.add(103);
        numbers.add(10638724);
        numbers.add(1723);

        for (Integer number: numbers) {
            if (number.equals(101))
                numbers.remove(number);
        }

        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
        System.out.println(numbers.contains(10009));
        System.out.println(numbers.equals(numbers));
        System.out.println(numbers1.isEmpty());
        System.out.println(numbers.remove(1));
        System.out.println(numbers);
    }
}
