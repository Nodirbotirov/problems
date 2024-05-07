package codingBat.functional;

import java.util.List;

public class NoTeen {
    public static void main(String[] args) {

    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

}
