import java.util.*;

public class HashMapInJava {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 10);
        hm.put("China", 20);
        hm.put("US", 30);
        hm.put("UK", 15);
        hm.put("Russia", 40);


        // System.out.println(hm);

        //Get - O(1)
    //    System.out.println(hm.get("India"));

       //ContainsKey - O(1)
    //    System.out.println(hm.containsKey("India")); //true

        // Remove - O(n)
    //    hm.remove("China");
    //    System.out.println(hm);

        //Size
    //     System.out.println(hm.size());

        //Clear
        // hm.clear();

        // System.out.println(hm.isEmpty());


        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String key : keys) {
            System.out.println("key="+key+",value="+ hm.get(key));
        }
    }
}