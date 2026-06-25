
import java.util.Scanner;


public class BasicInStrings {

    // Traverse in string
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // String str = "abcd";

        // length() function in str
        // String str2 = new String("xyzcewcs");
        // System.out.println(str2.length());

        // Strings are immutable
        // Input and Output in java 
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // Concatenation 
        String firstName = "Shradha";
        String lastName = "Khapra";
        String fullName = firstName + " " + lastName;

        printLetters(fullName);
    }
}