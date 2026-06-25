

public class IsDistinct {
    public static boolean isDistinct(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length-i-1; j++) {
                if(nums[i] == nums[j+1]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 3, 4, 4, 2, 5, 2, 3, 3, 0};
        System.out.println(isDistinct(nums));
    }
}