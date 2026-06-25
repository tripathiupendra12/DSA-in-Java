import java.util.ArrayList;

public class MonotonicAL {

    public static Boolean monotonisArr(ArrayList<Integer> list) {

        if(list.size() <= 2) {
            return true;
        }

        boolean inc = true;
        boolean dec = true;

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) < list.get(i-1)) {
                inc = false;
            }
            if(list.get(i) > list.get(i-1)) {
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(monotonisArr(list));
    }
}