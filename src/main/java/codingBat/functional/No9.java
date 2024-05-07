package codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(9);
        nums.add(19);
        nums.add(15);
        System.out.println(no9(nums));
    }

    public static List<Integer> no9(List<Integer> nums) {

        nums.removeIf(n -> (n % 10) == 9);
        return nums;

    }

}
