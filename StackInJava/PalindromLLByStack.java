import java.util.*;

public class PalindromLLByStack {

    public static boolean palindromLL(LinkedList<Character> ll) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < ll.size(); i++) { 
            s.push(ll.get(i));
        } 

        int k = 0;
        while(!s.isEmpty()) {
            if(s.pop() == ll.get(k)) {
                k++;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.addFirst('A');
        ll.addFirst('B');
        ll.addFirst('C');
        ll.addFirst('B');
        ll.addFirst('A');

        System.out.println(palindromLL(ll));
        // while(!ll.isEmpty()) {
        //     System.out.println(ll.removeFirst());
        // }
    }
}