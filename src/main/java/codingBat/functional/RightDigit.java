package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(556);
        nums.add(55);
        nums.add(106);
        nums.add(15);
        nums.add(7);
        System.out.println(rightDigit(nums));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer % 10)
                .collect(Collectors.toList());
    }
}
