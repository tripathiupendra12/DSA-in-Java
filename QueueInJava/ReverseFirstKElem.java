import java.util.*;

public class ReverseFirstKElem {

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        moveKToEnd(q, k);
        int s = q.size() - k;
        while(s-- > 0) {
            int x = q.poll();
            q.add(x);
        }

        return q;
    }

    public static void moveKToEnd(Queue<Integer> q, int k) {
        
        if(k == 0) {
            return;
        }
        int elem = q.poll();
        moveKToEnd(q, k-1);
        q.add(elem);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);   
        q.add(10);

        int k = 5;
        q = reverseFirstK(q, k);

        while(!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }
}