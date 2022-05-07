package codingBat;

public class WarmUp {
    public static void main(String[] args) {
        String str = "Chocolate";
        int n = 3;
        Front(str, n);
    }
            public static String Front(String str, int n){
                int frontLine = 3;
                if (frontLine > str.length()){
                    frontLine = str.length();
                }
                String front = str.substring(0, frontLine);
                String result = "";
                for (int i = 0; i < n; i++){
                    result = result + front;
                }
            System.out.println(result);
                return result;
            }
}
