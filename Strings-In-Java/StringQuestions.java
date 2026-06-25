
import java.util.Scanner;



public class StringQuestions {
    public static void main(String[] args) {
        // String str = "ShradhaDidi";
        // String  str1 = "ApnaCollege";
        // String str2= "ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));
        Scanner sc = new Scanner(System.in);
        String str = new Scanner(System.in).next();
        int countLowerCaseVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = (str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countLowerCaseVowels++;
            }
        }
        System.out.println(countLowerCaseVowels);
    }
}