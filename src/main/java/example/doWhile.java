package example;

public class doWhile {
    public static void main(String[] args) {
//        int n = 10;
//        do {
//            System.out.println("Hello World");
//            n--;
//        }while (n > 0);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                if (j==2){
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
