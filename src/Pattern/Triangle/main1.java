package Pattern.Triangle;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Print the upper half of the triangle
        for (int i = 1; i <= n; i++) { // Loop for the top part
            for (int j = 1; j <= i; j++) { // Print i stars
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower half of the triangle
        for (int i = n - 1; i >= 1; i--) { // Loop for the bottom part
            for (int j = 1; j <= i; j++) { // Print i stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
