package leetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(((()))";
        System.out.println(isValid(s));;
    }


    public static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': bracket.push(c); break;
                case '{': bracket.push(c); break;
                case '[': bracket.push(c); break;
                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
                default: ;
            }
        }
        return bracket.isEmpty();
//        if (!s.isEmpty()){
//            for (int i = 0; i < s.length()-1; i++){
//                if((s.charAt(i) =='(' ) && (s.charAt(i+1) != ')'&& (s.charAt(i+1) != '{' ) && (s.charAt(i+1) != '['))){
//                    return false;
//                }
//                if((s.charAt(i) =='{' ) && (s.charAt(i+1) != '}') && (s.charAt(i+1) != '[' && (s.charAt(i+1) != '('))){
//                    return false;
//                }
//                if((s.charAt(i) =='[' ) && (s.charAt(i+1) != ']') && (s.charAt(i+1) != '(') && (s.charAt(i+1) != '{')){
//                    return false;
//                }
//            }
//        }return true;
    }
}
