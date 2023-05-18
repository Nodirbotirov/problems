package biginning;

public class Beginning {


    public static void main(String[] args) {
//
//        int i = multiple(3, 4);
//        System.out.println(i);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        sonlar(5);
//
//        student("nodir, ", " botirov, ", 23, " 105B, ", 5.0);
//        student("bobur, ", " botirov, ", 23, " 105B, ", 5.0);
//        student("temur, ", " botirov, ", 23, " 105B, ", 5.0);
//        student("zarif, ", " botirov, ", 23, " 105B, ", 5.0);

        int max1 = findMax(93,5,100);
        int max2 = findMax(11,8,12);
        int max3 = findMax(94,6,101);


        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

    }

    public static int findMax(int a, int b, int c){
        int max;

        if (a > b && a > c){
            max = a;
        } else if (b > a && b > c) {
            max = b;
        }else {
            max = c;
        }
        return max;
    }

//
//    public static void student(String name, String surname, int age, String group, double averageMark){
//        System.out.println("ismi: " + name + "familyasi: " + surname + "yoshi: " + age + "guruhi: " + group + "bahosi: " + averageMark);
//    }
//
//    private static void sonlar(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//    }
//
//    private static int multiple(int a, int b) {
//        int c = a * b;
//
//        return c;
//    }



}
