package Matrix_Problem_Cp;

public class Ninty_Degre_AntiClockwise {
    public static  void rotate90Anticlockwise(int matrix[][]){
            int n=matrix.length;
            for(int i=0;i<n/2;i++){
                for(int j=i;j<n-i-1;j++){
                    int temp=matrix[i][j];
                    matrix[i][j] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = temp;
                }
            }

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("90 degree AntiClockwise Rotation");
        rotate90Anticlockwise(matrix);
        for(int row[]:matrix){
            for(int ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
