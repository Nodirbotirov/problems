package example;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        //switch hafta
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        switch (n){
//            case 1: System.out.println("Du");break;
//            case 2: System.out.println("Se");break;
//            case 3: System.out.println("Chor");break;
//            case 4: System.out.println("Pay");break;
//            case 5: System.out.println("Ju");break;
//            case 6: System.out.println("SH");break;
//            case 7: System.out.println("Yak");break;
//            default:
//                System.out.println("Bunday hafta kuni yo'q");
//        }


        /// n
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
////            sum = sum + i;
//            sum += i;
//        }
//        System.out.println(sum);

        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }


    }
}
