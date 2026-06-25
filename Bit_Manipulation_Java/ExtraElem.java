public class ExtraElem {

    public static int extraElem(int arr[], int ans) {
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 3, 3, 2};
        System.out.println(extraElem(arr, 0));
    }
}