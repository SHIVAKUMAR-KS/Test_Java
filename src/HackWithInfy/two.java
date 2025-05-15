package HackWithInfy;

import java.util.*;

public class two {

    // Count of swaps to convert s into target using greedy matching
    static int minSwapsToMakeEqual(char[] s, char[] target) {
        int n = s.length;
        List<Integer> pos0 = new ArrayList<>();
        List<Integer> pos1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') pos0.add(i);
            else pos1.add(i);
        }
        List<Integer> t0 = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (target[i] == '0') t0.add(i);
            else t1.add(i);
        }
        int swaps = 0;
        for (int i = 0; i < pos0.size(); i++) {
            swaps += Math.abs(pos0.get(i) - t0.get(i));
        }
        return swaps / 2;
    }

    public static int minimumSwaps(String s) {
        int n = s.length();
        int count0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') count0++;
        }
        int count1 = n - count0;


        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        char[] reversed = new StringBuilder(new String(sorted)).reverse().toString().toCharArray();

        return Math.min(minSwapsToMakeEqual(s.toCharArray(), sorted), minSwapsToMakeEqual(s.toCharArray(), reversed));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(minimumSwaps(s));
    }
}
