
import java.util.*;

public class DecodeString {

    public static String decodeString(String str) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String current = "";
        int num = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i) - '0');
            } else if (str.charAt(i) == '[') {
                numStack.push(num);
                strStack.push(current);
                num = 0;
                current = "";
            } else if (str.charAt(i) == ']') {
                int repeat = numStack.pop();
                String prev = strStack.pop();

                StringBuilder temp = new StringBuilder(prev);
                for(int k = 0; k < repeat; k++) {
                    temp.append(current);
                }
                current = temp.toString(); 
            } else {
                current += str.charAt(i);
            }
        }
        return current;
    }
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}