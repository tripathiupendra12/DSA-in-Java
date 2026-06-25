public class Basic {

    // Decreasing numbers
    public static void printNumbers(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNumbers(n-1);
    }

    // Increasing numbers
    public static void printNumInAcen(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }

        printNumInAcen(n-1);
        System.out.println(n);
    }

    // Factorial of a number
    public static int calcFact(int n) {
        if(n == 0 && n == 1) {
            return 1;
        }
        
        int fnm1 = calcFact(n-1);
        int fn = n * fnm1;
        return fn;
        // return n * calcFact(n-1);
    }

    // Calculate sum of N numbers
    public static int calcSum(int n) {
        if(n == 1) {
            return 1;
        }

        return n + calcSum(n-1);
    }
     public static void main(String[] args) {
        System.out.println(calcSum(5));
     }
}