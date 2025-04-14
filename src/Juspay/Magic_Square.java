package Juspay;
import java.util.*;
public class Magic_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxPower = 0;

        for (int i = 0; i < s.length() - 1; ) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            // Check for XY or YX
            if ((a == 'X' && b == 'Y') || (a == 'Y' && b == 'X')) {
                maxPower++;
                i += 2; // skip next to avoid overlap
            } else {
                i++; // move normally
            }
        }

        System.out.println(maxPower);
    }
}
