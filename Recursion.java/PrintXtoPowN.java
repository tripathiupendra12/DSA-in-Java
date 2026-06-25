public class PrintXtoPowN {

    // TC = O(n)
    public static int printPower(int x, int n) {

        if(n == 0) {
            return 1;
        }
        int Xnm1 = printPower(x, n-1);
        return x * Xnm1;
    }


    // Optimized Solution TC = O(logn)
    public static int optimizedPower(int a, int n) {

        if(n == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(3, 3));
    }
}