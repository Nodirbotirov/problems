package codingBat.string;

public class XyzMiddle {
    public static void main(String[] args) {
        String str = "xyzxyzAxyzxyzxy";
        System.out.println(xyzMiddle(str));
    }


//    public static boolean xyzMiddle(String str) {
//        if (str.length() < 3) {
//            return false;
//        }
//        int i = str.indexOf("xyz");
//        int j = str.indexOf("xyz");
//        String x = str.substring(0, i);
//        String y = str.substring(j+3, str.length());
//        System.out.println(x);
//        System.out.println(y);
//        if (x.length() == y.length() || x.length() == (y+1).length() || y.length() == (x+1).length()) {
//            return true;
//        }
//        return false;
//    }

    public static boolean xyzMiddle(String str) {
        if(str.length() < 3)
            return false;

        int start1 = str.length() / 2 - 2;
        int start2 = str.length() / 2 - 1;
        System.out.println(start1);
        System.out.println(start2);

        if(str.length() % 2 == 0) {
            return str.startsWith("xyz", start1) || str.startsWith("xyz", start2);
        }

        return str.startsWith("xyz", start2);
    }
}
