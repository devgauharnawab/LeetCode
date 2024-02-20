package array_questions;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] arr = new int[col][row];
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TransposeMatrix tr = new TransposeMatrix();
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println("Transpose of a Matrix : ");
        int[][] res = tr.transpose(matrix);
        for (int i = 0; i < res.length; i++){
            for (int j = 0; j < res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
