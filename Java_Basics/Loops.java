
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for( int i=2; i<Math.sqrt(n); i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.err.println("number is prime number.");
        } else {
            System.err.println("number is not prime number.");
        }

        // Question 1
        long num = sc.nextLong();
        int oddSum = 0;
        int evenSum = 0;
        long temp = num;
        while(temp>0) {
            long lastNum = (temp % 10);
            if(lastNum % 2 == 0){
                evenSum += lastNum;
            } else {
                oddSum += lastNum;
            }
            temp = temp / 10;
        }
        System.out.println("sum of odd numbers in " + num + " is " + oddSum);
        System.out.println("sum of even numbers in "+ num + " is " + evenSum);
    }
}