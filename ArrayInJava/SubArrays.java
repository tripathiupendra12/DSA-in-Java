

// public class SubArrays {

//      public static void m_mInArr(int sumArr[]) {
//         int largest = Integer.MIN_VALUE; // -infinity
//         int smallest = Integer.MAX_VALUE; // -infinity
//         for (int i = 0; i < sumArr.length; i++) {
//             if(sumArr[i] > largest){
//                 largest = sumArr[i];
//             }
//             if(sumArr[i] < smallest){
//                 smallest = sumArr[i];
//             }
//         }
//         System.out.println("largest no. in an array : "+ largest);
//         System.out.println("smallest no. in an array : "+ smallest);

//     }

//     public static void printSubarrays(int arr[]) {
//         // int totSubArr = arr.length * (arr.length + 1) / 2;
//         // int sumArr[] = new int[totSubArr];
//         // int idx = 0;
//         int currSum;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 currSum=0;
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k]+" ");
//                     currSum += arr[k];
//                 }
//                 // sumArr[idx++] = sum;

//                 System.out.println(currSum);
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println();
//         }

//         for (int i = 0; i < sumArr.length; i++) {
//             System.out.print(sumArr[i]+ " ");
//         }
//         m_mInArr(sumArr);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2, 4, 6, 8, 10};

//         printSubarrays(arr);

//     }
// }