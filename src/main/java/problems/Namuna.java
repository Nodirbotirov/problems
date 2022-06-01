package problems;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Namuna {
    public static void main(String[] args) {
        String muntazamIfoda = "z[a-r]r";

        String matn = "zerikarle zarar zar munozara kazarma nazar zarur zarb buldozae lazer ozor" +
                " bozor televezor ozor bozor hozir vazir zirak ziravor huzur zurriyat";

        char[] belgi = new char[matn.length()];

        Pattern tartib = Pattern.compile(muntazamIfoda);
        Matcher moslik = tartib.matcher(matn);

        int sanoq = 0;

        while (moslik.find()){
            sanoq++;
            System.out.println(sanoq+") " + moslik.start()+"~"+
                    moslik.end() + "oraliqda moslik topildi.");
            Arrays.fill(belgi, moslik.start(), moslik.end(), '^');
        }
        System.out.println(matn);
        System.out.println(new String(belgi));
        System.out.println("Jami "+sanoq+"-ta mostlik topildi");
    }
}
