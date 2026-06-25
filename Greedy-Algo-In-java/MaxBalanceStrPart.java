public class MaxBalanceStrPart {

    public static int balancedPartition(String str, int n) {

        // if size is 0 then ans is 0
        if(n == 0) {
            return 0;
        }

        // variable that represents the num of 'R's and 'L's
        int r = 0, l = 0;

        //to store max number of possible partitions
        int ans = 0;
        for(int i = 0; i < n; i++) {
            //Increment the var r if the character in the string is 'R'
            if(str.charAt(i) == 'R') {
                r++;
            } else if(str.charAt(i) == 'L') {
                l++;
            } 

            // if r and l are equal then inc ans
            if(r == l) {
                ans++;
            } 
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "LLRRRLLRRL";
        int n = str.length();

        System.out.println(balancedPartition(str, n));
    }
}