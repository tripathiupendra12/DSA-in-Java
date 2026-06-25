import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index:"+ index);        }
    }
}