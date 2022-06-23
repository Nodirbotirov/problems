package collection;

public class FinishArray {
    public static void main(String[] args) {

        int[] sonlar = {5, 9, 10, 12, 8, 3};

        for (int i = sonlar.length-1; i >= 0; i--) {
            System.out.println(sonlar[i]);
        }
    }
}
