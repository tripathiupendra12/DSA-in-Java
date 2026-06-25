

public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = end - start / 2;

            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 12, 14, 16, 20};
        int key = 43;

        System.out.println("index for kwy is : "+ binarySearch(arr, key));
    }
}