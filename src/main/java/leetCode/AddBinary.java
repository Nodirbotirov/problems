package leetCode;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "101";
        System.out.println(addBinary(a, b));
    }


    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';

            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    public static String addBinary2(String a, String b) {
        String[] list = new String[]{a, b};
        int[] dataInt = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            String[] split = list[i].split("");
            int d = 0;
            for (int j = split.length - 1; j >= 0; j--) {
                d += (int) (Integer.parseInt(split[j]) * Math.pow(2, split.length - j));
            }
            dataInt[i] = d;
        }
        int i = dataInt[0] + dataInt[1];
        int d = i / 2;
        String retVal = "";
        while (d >= 2) {
            retVal += (d % 2);
            d = d / 2;
        }
        retVal += d;
        String dd = "";
        String[] split = retVal.split("");
        for (int i1 = (split.length - 1); i1 >= 0; i1--) {
            dd += split[i1];
        }
        return dd;
    }
}
