package Pattern.Right_Triangle;

import java.util.Scanner;

public class Left_right_traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //part-1
                //1.System.out.print(i+" ");
                //2.System.out.print((char)(i+64)+" ");
                //3.System.out.print((char)(i+96)+" ");

                //part-2;
                System.out.print(j+" ");
                //2.System.out.print((char)(j+64)+" ");
                //3.System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}

/* 1
5
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */

/* 2
4
A
B B
C C C
D D D D

 */

/* 3
5
a
b b
c c c
d d d d
e e e e e
 */