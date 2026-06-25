import java.util.ArrayList;

public class MostFreqNum {

    public static int maxFreqNum(ArrayList<Integer> nums, int key) {
        int res[] = new int[1000];
        for(int i = 0; i< nums.size()-1; i++) {
            if(nums.get(i) == key) {
                res[nums.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < res.length; i++) {
            if(res[i] > max) {
                max = res[i];
                ans+=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int key = 2;

        System.out.println(maxFreqNum(nums, key));
    }
}