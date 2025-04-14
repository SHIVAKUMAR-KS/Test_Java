package Juspay;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        // Step 1: Build frequency and sorted list of unique characters
        boolean[] present = new boolean[26];
        for (char ch : s.toCharArray()) {
            present[ch - 'a'] = true;
        }

        List<Character> sortedChars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (present[i]) {
                sortedChars.add((char) ('a' + i));
            }
        }

        char minChar = sortedChars.get(0);
        StringBuilder result = new StringBuilder();

        // Step 2: Handle case when k > n
        if (k > n) {
            result.append(s);
            while (result.length() < k) {
                result.append(minChar);
            }
            System.out.println(result.toString());
            return;
        }

        // Step 3: Try to increment from the end
        char[] sChars = s.toCharArray();
        for (int i = k - 1; i >= 0; i--) {
            char curr = sChars[i];
            for (char ch : sortedChars) {
                if (ch > curr) {
                    // Step 4: Build the new string
                    result.append(s.substring(0, i));
                    result.append(ch);
                    while (result.length() < k) {
                        result.append(minChar);
                    }
                    System.out.println(result.toString());
                    return;
                }
            }
        }
    }
}
