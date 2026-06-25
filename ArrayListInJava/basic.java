import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Get Operation O(1)
        System.out.println(list.get(2));

        // Remove Operation O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at Index O(n)
        list.set(2, 10);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}