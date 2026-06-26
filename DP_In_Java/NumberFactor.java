
import java.util.Arrays;

public class NumberFactor {

    public static int ways(int n) {

        if (n == 0 || n == 1 || n == 2)
            return 1;

        if (n == 3)
            return 2;

        return ways(n - 1)
                + ways(n - 3)
                + ways(n - 4);
    }

    public static int waysMemo(int n, int[] dp) {

        if (n == 0 || n == 1 || n == 2)
            return 1;

        if (n == 3)
            return 2;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = ways(n - 1)
                + ways(n - 3)
                + ways(n - 4);

        return dp[n];
    }

    public static int waysTab(int n) {

        if (n == 0 || n == 1 || n == 2)
            return 1;

        if (n == 3)
            return 2;

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1]
                    + dp[i - 3]
                    + dp[i - 4];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(ways(n));
        System.out.println(waysMemo(n, dp));
        System.out.println(waysTab(n));
    }
}