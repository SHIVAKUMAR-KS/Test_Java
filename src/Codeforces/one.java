package Codeforces;

import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        while (T-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long l1 = 0, r1 = 0;

            for (int i = 0; i <= r; i++) {
                if (i == m) {
                    r1 = i;
                }
            }

            for (int j = 0; j >= l; j--) {
                if (r + Math.abs(j) == m) {
                    r1 = r;
                    l1 = j;
                }
            }

            System.out.println(l1 + " " + r1);
        }
    }
}
