package HackWithInfy;

import java.util.*;

public class two {

    // Count of swaps to convert s into target using greedy matching
    static int minSwapsToMakeEqual(char[] s, char[] target) {
        int n = s.length;
        List<Integer> pos0 = new ArrayList<>();
        List<Integer> pos1 = new ArrayList<>();

        // Record positions of 0s and 1s in the original string
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') pos0.add(i);
            else pos1.add(i);
        }

        // Record positions in target where 0s and 1s should go
        List<Integer> t0 = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (target[i] == '0') t0.add(i);
            else t1.add(i);
        }

        // Calculate total swap distance for matching 0s and 1s to their correct positions
        int swaps = 0;
        for (int i = 0; i < pos0.size(); i++) {
            swaps += Math.abs(pos0.get(i) - t0.get(i));
        }
        return swaps / 2; // each swap fixes 2 positions
    }

    public static int minimumSwaps(String s) {
        int n = s.length();
        int count0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') count0++;
        }
        int count1 = n - count0;

        // Total "01" and "10" subsequences
        // Our goal is to rearrange to balance them

        // Try possible balanced target: make it like "alternating" arrangement
        // One possible balanced configuration: sort 0s and 1s in such a way that both types of subsequences are equal
        // Best is to sort 0s and 1s together in a balanced way

        // Construct target configuration: alternate 0s and 1s if even
        // But here we'll just sort the array as 0...0 1...1 (greedy)
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);

        // Try sorted (all 0s then 1s) and reverse sorted (all 1s then 0s), take min swaps
        char[] reversed = new StringBuilder(new String(sorted)).reverse().toString().toCharArray();

        return Math.min(minSwapsToMakeEqual(s.toCharArray(), sorted), minSwapsToMakeEqual(s.toCharArray(), reversed));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(minimumSwaps(s));
    }
}
