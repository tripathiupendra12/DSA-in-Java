
import java.util.Scanner;



public class PracticeSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PRACTICE SET 1
        // int num = sc.nextInt();
        // if(num > 0) {
        //     System.err.println("Number is positive");
        // } else if(num < 0) {
        //     System.err.println("Number is Negative");
        // } else {
        //     System.err.println("Number is zero");
        // }

        // // PRACTICE SET 2
        // double temp = 100;
        // String isFever = (temp > 100) ? "You have a fever." : "You don't have a fever.";
        // System.err.println(isFever);

        // PRACTICE SET 3
        int year = sc.nextInt();

        String isLearYear = ((year%100 == 0) && (year%400 == 0) || (year%4 == 0)) ? "leap year" : "Not a leap year";
        System.out.println(isLearYear);
    }
}