//import java.util.*;
//class BeingZero{
//    int xdir[]={-1,0,1,0};
//    int ydir[]={0,1,0,-1};
//    public void dfs(char grid [][], int i,int j,int n, int m){
//        if(i<0 || i>=n || j<0 || j>=m || grid[i][j] !='0' ){
//            return;
//        }
//        grid[i][j]='s';
//        for(int k=0;k<4;k++){
//            int newRow=i+xdir[k];
//            int newCol=j+ydir[k];
//            dfs(grid,newRow, newCol,n,m);
//        }
//    }
//    public void surroundedRegions (char[][] board) {
//        if(board==null || board.length==0){
//            return;
//        }
//        int n=board.length;
//        int m=board[0].length;
//        int visited[][]=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if((i==0 || i==n-1 || j==0 || j==m-1) && board [i][j]=='0'){
//                    dfs(board,i,j,n,m);
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(board[i][j]=='0'){
//                    board[i][j]='X';
//                }else if(board[i][j]=='S'){
//                    board[i][j]='0';
//                }
//            }
//        }
//    }
