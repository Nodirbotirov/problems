package letcode;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public int roman(String s){
        Map <Character, Integer> roman = new HashMap<>();

        roman.put('I',1); roman.put('V',5); roman.put('X',10); roman.put('L',50); roman.put('C',100);
        roman.put('D',500); roman.put('M',1000);
        int output = 0;

        for (int i =0; i<s.length(); i++){
            if (i+1!=s.length()&&roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
                output+=(roman.get(s.charAt(i+1))-roman.get(s.charAt(i)));
                i++;
            }else {
                output+=roman.get(s.charAt(i));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "XVI";
        Roman roman1 = new Roman();
        System.out.println(roman1.roman(s));
    }
}
