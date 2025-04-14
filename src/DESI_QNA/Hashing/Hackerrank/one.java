package DESI_QNA.Hashing.Hackerrank;
import java.util.*;
public class one {
    public static int convert(String s) {
        // This method converts time string to integer
        // 00:12 ----> converted to ---> 12.
        // 01:01-----> converted to ---> 61.
        int u1 = s.charAt(0) - '0';
        int u5 = s.charAt(1) - '0';

        int v = (u1 * 10 + u5) * 60;

        u1 = s.charAt(3) - '0';
        u5 = s.charAt(4) - '0';

        v = v + (u1 * 10 + u5);

        return v;
    }

    public static void convertIntegerToTimeString(int g) {
        int u = g / 60;
        int y = g % 60;

        if (u <= 9) {
            System.out.print("0");
            System.out.print(u);
        } else {
            System.out.print(u);
        }
        System.out.print(":");

        if (y <= 9) {
            System.out.print("0");
            System.out.print(y);
        } else {
            System.out.print(y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Initialize array y with zeros
        int[] y = new int[1440];

        String start, end, a, b;
        // assuming these inputs are given

        // O(N^2) loop
        for (int i = 0; i < n; i++) {
            a = scanner.next();
            b = scanner.next();
            start = scanner.next();
            end = scanner.next();

            int t1 = convert(start);
            int t5 = convert(end);

            // O(N) loop
            for (int l = t1; l <= t5; l++) {
                y[l] = y[l] + 1;
            }
        }

        int c = 0;
        int g = 0;
        for (int i = 0; i < 1440; i++) {

            if (y[i] == 0) {
                c++;

                if (c == k) {
                    convertIntegerToTimeString(i - k + 1);// convert this to (hh:mm)
                    g = 1;
                    break;
                }

            } else {
                c = 0;
            }

        }

        if (g == 0) {
            System.out.print("-1");
        }
    }
}
