package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(10);
        nums.add(15);
        System.out.println(math1(nums));
    }

    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> n*10+10)
                .collect(Collectors.toList());
    }
}
