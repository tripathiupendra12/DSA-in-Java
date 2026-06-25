

public class Function {

    // public static void swap(int a, int b) {
    //     // swap
    //     int temp = a;
    //     a = b; 
    //     b = temp;

    // }

    public static int calcProd(int a, int b) {
        int pro = a*b;
        return pro;
    }

    public static int calFact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = calFact(n);
        int fact_r = calFact(r);
        int fact_nmr = calFact(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec(int binNum) {
        int temp = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int LastDig = binNum % 10;
            decNum = decNum + (LastDig * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;

        }
        System.out.println("decimal of "+ temp + " = "+ decNum);
    }

    public static void decToBin(int decNum) {
        int temp = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0) {
            int r = decNum % 2;

            binNum = binNum + (r * (int)Math.pow(10, pow));
            pow++;

            decNum = decNum / 2;
        }
        System.out.println("binary of "+ temp + " = "+ binNum);
    }

    public static double calAvg(double a, double b, double c) {
        return (a+b+c)/3;
    }

    public static boolean isEven(int num) {
        
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void isPalindrome(int n) {
        int temp = n;
        int rev = 0;
         
         while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;

            n = n / 10;
         }

         if(temp == rev) {
            System.out.println(temp+ " is Palindrome number.");
         } else {
            System.out.println(temp+ " is Palindrome number.");
         }
    }
    
    public static int sumOfDig(int n) {
        int sum = 0;
         
         while(n > 0) {
            int lastDig = n % 10;
            sum = sum + lastDig;
             n = n / 10;
         }
         return sum;
    }
 
    public static void main(String[] args) {
        System.out.println("Sum of digit in "+ sumOfDig(362));

        // if(isEven(7)) {
        //     System.out.println("Number is Even");
        // } else {
        //     System.out.println("Number is Odd");
        // }

        // System.out.println("x = "+ x);
        // System.out.println("y = "+ y);
    }
}