package leetCode.task;

public class SqrtX {
    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();
        int x = 16;
        System.out.println(sqrtX.mySqrt(x));

    }
    public int mySqrt(int x) {
        int squareRoot = (int) Math.sqrt(x);
        return squareRoot;
    }
}
