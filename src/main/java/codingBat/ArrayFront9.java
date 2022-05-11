package codingBat;

public class ArrayFront9 {
    public static void main(String[] args) {
        int[] front = {4,6,9,5};
        arrayFront9(front);
    }

    public static void arrayFront9(int[] nums) {
        int end =nums.length;
        if(end > 4) end = 4;

        for (int i=0; i<end; i++){
            if (nums[i] ==9) System.out.println(true);
        }
        System.out.println(false);
    }
}
