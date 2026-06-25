import java.util.LinkedList; //JCF -> optimized

public class LLInCollFramework {

    public static void main(String[] args) {
        
    // create - objects int, float, boolean -> Integer, Character, String, Float
    LinkedList<Integer> ll = new LinkedList<>();

    // Add in ll
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);

    // print 
    System.out.println(ll); //0->1->2

    //remove
    ll.removeLast();
    ll.removeFirst();

    System.out.println(ll);

    }
}