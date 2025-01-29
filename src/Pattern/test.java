package Pattern;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n Val:");
        int n=sc.nextInt();

        for(int i=n;i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//        for(int i=1;i<n;i++){
//            for(int j=1;j<n-i;j++){
//                System.out.print("  ");
//            }
//
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //-------

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
