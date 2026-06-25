import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {

        //Stack to store all the names from arr array
        Stack<String> s = new Stack<>();

        //Store all the names inside the array
        String parts[] = path.split("/");

        //we will iterate through each word in array and
        //try to put them inside the stack

        for(String part : parts) {

            if(part.equals("") || part.equals(".")) {
                //skip
                continue;
            } else if(part.equals("..")) {
                //curr is // and stack has element at top
                if(!s.isEmpty()) {
                    s.pop();
                } 
            } else {
                    s.push(part);
                }
        }

    StringBuilder ans = new StringBuilder();

    for (String dir : s) {
        ans.append("/").append(dir);
    }
    return ans.length() == 0 ? "/" : ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
}