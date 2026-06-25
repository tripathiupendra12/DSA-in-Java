

public class DiagonalSum {

    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            // pd
            sum+= matrix[i][i];
            // sd
            if(i != matrix.length-1-i) {
                sum+= matrix[i][matrix.length-i-1];
            }
        } 
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 8},
                          {5, 6, 7, 8, 7},
                          {9, 10, 11, 12, 2},
                          {13, 14, 15, 16, 0},
                          {23, 34, 67, 87, 9}};
        System.out.println(DiagonalSum(matrix));
    }
}