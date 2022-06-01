package problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MuntazamTartib {
    public static void main(String[] args) {
        Scanner kiritilgan = new Scanner(System.in);
        while (true){
            System.out.println("Yakunlash uchun 'n' deb yozing.");
            System.out.print("Tartibni kiriting: ");
            String kiritilganTartib = kiritilgan.nextLine();
            if (kiritilganTartib.equals("n")){
                System.out.println("Dastur yakunlandi");
                System.exit(1);
            }

            System.out.println("Matnni kiriting");
            String kiritilganMatn = kiritilgan.nextLine();
            char[] belgilar = new char[kiritilganMatn.length()];
            int mostlikSoni=0;

            Pattern tartib = Pattern.compile(kiritilganTartib);
            Matcher mostlik = tartib.matcher(kiritilganMatn);
            while (mostlik.find()){
                Arrays.fill(belgilar, mostlik.start(), mostlik.end(), '^');
                mostlikSoni++;
            }
            if (mostlikSoni>0){
                System.out.println(kiritilganMatn);
                System.out.println(belgilar);
                System.out.println(mostlikSoni+ "ta mostlik topildi");
            }else {
                System.out.println("Mostlik topilmadi");
            }
        }
    }
}
