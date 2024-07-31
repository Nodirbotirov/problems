package leetCode;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 6;

        searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {

        if(target > nums[nums.length-1]){
            System.out.println(nums.length);
            return nums.length;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                System.out.println(i);
                return i;
            }
        }

        return 0;

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                System.out.println(i);
//                return target;
//            }else if(nums[i] > target) {
//                System.out.println(i);
//                return i;
//            }else if(nums.length-1 < target) {
//                System.out.println(nums.length);
//                return nums.length;
//            }
//        }
//        return target;
    }
}
