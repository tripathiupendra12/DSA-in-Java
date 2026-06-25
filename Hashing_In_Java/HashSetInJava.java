import java.util.*;

public class HashSetInJava {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();

        sets.add(1);
        sets.add(2);
        sets.add(4);
        sets.add(2);
        sets.add(1);
        sets.add(1);

        System.out.println(sets);

        //Iteration on set
        // Iterator it = sets.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //enhanced loop in java
        for(Integer set : sets) {
            System.out.println(set);
        }
    }
}