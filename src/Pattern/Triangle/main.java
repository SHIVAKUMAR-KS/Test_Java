package Pattern.Triangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i <=n; i++) {
            // Print dashes
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");//for traingle  only one space
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
