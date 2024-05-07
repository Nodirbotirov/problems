package codingBat.functional;

import java.util.List;

public class Square56 {
    public static void main(String[] args) {

    }

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n * n + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }

}
