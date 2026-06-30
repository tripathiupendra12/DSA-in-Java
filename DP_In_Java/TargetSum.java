public class TargetSum {
    public static boolean ts(int n,  int[] nums, int sum) {
        if(sum == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }

        if(nums[n-1] <= sum) {
            boolean ans1 = ts(n-1, nums, sum - nums[n-1]);

            boolean ans2 = ts(n-1, nums, sum);
            return ans1 || ans2;
        } else {
            return ts(n-1, nums, sum);
        }
    }

    public static boolean tsMemo(int n,  int[] nums, int sum, boolean dp[][]) {
        if(sum == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }

        if(dp[n][sum] != false) {
            return dp[n][sum];
        }

        if(nums[n-1] <= sum) {
            boolean ans1 = tsMemo(n-1, nums, sum - nums[n-1], dp);

            boolean ans2 = tsMemo(n-1, nums, sum, dp);
            dp[n][sum] =  ans1 || ans2;
        } else {
            dp[n][sum] = tsMemo(n-1, nums, sum, dp);
        }
        return dp[n][sum];
    }

    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];

        // i = items && j = target sum
        for(int i = 0; i < n+1; i++) {
            dp[i][0] = true;
        }

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < sum+1; j++) {
                int v = arr[i-1];
                //include
                if(v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                } 
                //exclude
                else if(dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int n = 5;
        int nums[] = {4, 2, 7, 1, 3};
        int sum = 10;
        boolean dp[][] = new boolean[n+1][sum+1]; 
        System.out.println(ts(n, nums, sum));
        System.out.println(tsMemo(n, nums, sum, dp));
        System.out.println(targetSumSubset(nums, sum));
    }
}