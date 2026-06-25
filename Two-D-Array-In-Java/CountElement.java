

public class CountElement {

    public static void printCount(int matrix[][], int elem) {
        int count = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == elem) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7},
                          {3, 2, 1}};
       printCount(matrix, 8);
    }
}