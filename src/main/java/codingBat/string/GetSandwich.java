package codingBat.string;

public class GetSandwich {
    public static void main(String[] args) {
        String str = "dfgfdshbreadjambreadbread";
        System.out.println(getSandwich(str));
    }



    public static String getSandwich(String str) {
        StringBuffer sb = new StringBuffer();
        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");
        for (int i = first + 5; i < second; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
