import java.util.*;

public class LHS {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(2);
        lhs.add(4);
        lhs.add(2);
        lhs.add(1);
        lhs.add(1);

        System.out.println(lhs);

        //Iteration on set
        // Iterator it = sets.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //enhanced loop in java
        // for(Integer set : sets) {
        //     System.out.println(set);
        // }
    }
}