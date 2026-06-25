import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 120);
        lhm.put("Russia", 150);
        lhm.put("US", 200);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("Russia", 150);
        hm.put("US", 200);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 120);
        tm.put("Russia", 150);
        tm.put("US", 200);
        tm.put("Indonasia", 50);

        System.out.println(tm);
        System.out.println(hm);
    }
}