package array_questions;

public class RotateImage {
    public void rotate(int[][] matrix){
        //transpose of matrix
        int n = matrix.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];//last column index
                matrix[i][n-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage rr = new RotateImage();
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        // Rotate the matrix (transpose)
        rr.rotate(matrix);

        // Print the transposed matrix
        System.out.println("Rotate Image 90 Degree:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
