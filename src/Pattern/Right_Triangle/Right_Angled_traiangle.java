package Pattern.Right_Triangle;

import java.util.Scanner;

public class Right_Angled_traiangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        /*
        //sidha triangle
        for (int i = 1; i <= n; i++) {
            // Print dashes
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");// two space or else - one space
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */
        for(int i=n;i>=0;i--){
            //print space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //print star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }

    /*

    5
        *
      * *
    * * *
  * * * *
* * * * *



5
* * * * *
  * * * *
    * * *
      * *
        *

     */
}
