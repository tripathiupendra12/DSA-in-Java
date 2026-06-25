import java.util.Scanner;

public class ConditionalStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;

        if(income < 500000) {
            System.out.println("0% tax");
        } else if (income >= 500000 && income <1000000) {
            tax = income * 0.2;
            System.out.println(tax);
        } else {
            tax = income * 0.3;
             System.out.println(tax);
             }

        // TERNARY OPERATOR
        int num = 4;
        String type = ((num % 2) == 0) ? "EVEN" : "ODD";
        System.err.println(type);

        int marks = 32;
        String res = ((marks >= 33) ? "PASS" : "FAIL");
        System.err.println(res);
    }
}