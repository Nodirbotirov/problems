package problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SonniTopish {
    public static void main(String[] args) {
        String muntazamIfoda = "([+|-]?(\\d+(\\.\\d*)?))|([+|-]?(\\.\\d+))";
        String matn = "16 ning kvadrati 256 va 6.25ning" +
                " kvadt ildizning -2.5 va - .243 0.21234 dan kichik";
        Pattern tartib = Pattern.compile(muntazamIfoda);
        Matcher mostlik = tartib.matcher(matn);
        while (mostlik.find()){
            System.out.println(matn.substring(mostlik.start(), mostlik.end()));
        }
    }
}
