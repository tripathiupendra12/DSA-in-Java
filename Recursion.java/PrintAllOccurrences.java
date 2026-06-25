public class PrintAllOccurrences {

    public static void printAllOccurrences(int arr[], int i, int key) {

        // base case
        if(i == arr.length) {
            return;
        }

        // Kaam 
        if(arr[i] == key) {
            System.out.println(i);
        }
        printAllOccurrences(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printAllOccurrences(arr, 0, 2);
    }
}