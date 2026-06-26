public class FirstClass {
    //Recursion
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    //Memorization(Top Down)
    public static int fibMemorization(int n, int[] f) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(f[n] != 0) { //fib(n) is already calculated
            return f[n];
        }

        f[n] = fibMemorization(n-1, f) + fibMemorization(n-2, f);
        return f[n];
    }

    //Tabulation(Bottom Up)
    public static int fibTabulation(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n]; //ans
    } 

    public static void main(String[] args) {
        int n = 5; 
        int f[] = new int[n+1]; // [0, 0, 0, ......]
        System.err.println(fibTabulation(n)); // 5
        System.err.println(fibMemorization(n, f)); // 5
        System.err.println(fib(n)); // 5
    }
}