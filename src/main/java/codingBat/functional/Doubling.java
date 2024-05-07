package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(10);
        nums.add(15);
        System.out.println(doubling(nums));
    }

    public static List<Integer> doubling(List<Integer> nums) {
//        nums.replaceAll(n -> n * 2);
//        return nums;
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
