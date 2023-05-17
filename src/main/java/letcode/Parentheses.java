package letcode;

public class Parentheses {
    public static void main(String[] args) {

    }
    boolean isValid(String s) {

        for(int i=0; i<s.length(); i++){
            if(
                    (s[i].equals("(") && s[i+1].equals(")"))
                            || (s[i].equals("[") && s[i+1].equals("]"))
                            || (s[i].equals("{") && s[i+1].equals("}"))
            ){
                return true;
            }
            return false;
        }
        return false;
    }
}
