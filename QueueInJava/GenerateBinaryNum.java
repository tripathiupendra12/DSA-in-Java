import java.util.*;

public class GenerateBinaryNum {

    public static Deque<String> generateBinaryNum(int n) {

        Deque<String> res = new LinkedList<>();

        for(int num = 1; num <= n; num++) {
            int temp = num;
            String binary = "";

            while(temp > 0) {
                int rem = temp % 2;
                if(rem == 0) {
                    binary += "0";
                } else {
                    binary += "1";
                } 

                temp = temp / 2;
            }

            StringBuilder str = new StringBuilder(binary);
            binary = str.reverse().toString();

            res.addLast(binary);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;

        Deque<String> d = generateBinaryNum(n);

        while(!d.isEmpty()) {
            System.out.println(d.getFirst());
            d.removeFirst();
        }
    }
}