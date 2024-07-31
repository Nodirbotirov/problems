package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }

        public static int removeDuplicates(int[] nums) {
            int index=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1])
                {
                    nums[++index]=nums[i];
                }
            }
            return index+1;
        }

}
