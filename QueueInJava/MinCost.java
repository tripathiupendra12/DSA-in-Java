import java.util.*;

public class MinCost {

    public static int minCost(int arr[]) {
        //create Priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add all elem from arr into the pr
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        //cost of two min rope lenght
        int res = 0;
        while(pq.size() > 1) {

            //Extract shortest two ropes from pq
            int first = pq.poll();
            int second = pq.poll();

            //update res and insert the new rope to pq
            res += first + second;
            pq.add(first + second);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10};

        System.out.println(minCost(arr));
    }
}