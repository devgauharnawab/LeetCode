package array_questions;


//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
//        Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//                                       ^
//        Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]  it means each 0 replace by 1 and each 1 replace by 0
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image){
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < (n+1)/2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n-j-1] ^ 1;
                image[i][n-j-1] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        FlippingAnImage fl = new FlippingAnImage();
        int[][] matrix = {{1,1,0},
                {1,0,1},
                {0,0,0}};
        System.out.println("Invert Of An Image : ");
        int[][] res = fl.flipAndInvertImage(matrix);
        for (int i = 0; i < res.length; i++){
            for (int j = 0; j < res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
