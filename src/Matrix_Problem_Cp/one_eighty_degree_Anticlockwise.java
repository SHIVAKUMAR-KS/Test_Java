package Matrix_Problem_Cp;

public class one_eighty_degree_Anticlockwise {
    public static void rotate180Degree(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("180 degree Anticlockwise Rotation");
        rotate180Degree(matrix);
        for(int row[]:matrix){
            for(int ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
