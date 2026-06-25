public class SplitArrIntoKSubArr {

    public static int splitArray(int[] nums, int k) {
        int low = 0, high = 0;

        // Define search space
        for (int num : nums) {
            low = Math.max(low, num); // at least the max element
            high += num;              // at most sum of all elements
        }

        // Binary search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;   // try smaller max sum
            } else {
                low = mid + 1; // need bigger max sum
            }
        }

        return low;
    }

    // Greedy check
    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = num;
                if (subarrays > k) return false;
            } else {
                currentSum += num;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(splitArray(arr, k)); // Output: 18
    }
}
