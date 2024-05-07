package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(-10);
        nums.add(15);
        System.out.println(noNeg(nums));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

}
