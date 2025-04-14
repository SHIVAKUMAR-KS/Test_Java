package Juspay;

import java.util.*;

public class EncryptedFile {

    public static String getNextFileName(int n, int k, String s) {
        TreeSet<Character> allowedChars = new TreeSet<>();
        for (char ch : s.toCharArray()) {
            allowedChars.add(ch);
        }

        // Convert TreeSet to list for indexed access
        List<Character> sortedChars = new ArrayList<>(allowedChars);
        char minChar = sortedChars.get(0);

        // Case 1: When k > n → Append min char
        if (k > n) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = n; i < k; i++) {
                sb.append(minChar);
            }
            return sb.toString();
        }

        // Case 2: When k <= n → Find smallest lexicographical larger string
        char[] ans = s.substring(0, k).toCharArray();

        for (int i = k - 1; i >= 0; i--) {
            char curr = ans[i];
            int index = Collections.binarySearch(sortedChars, curr);
            if (index < sortedChars.size() - 1) {
                ans[i] = sortedChars.get(index + 1);
                for (int j = i + 1; j < k; j++) {
                    ans[j] = minChar;
                }
                return new String(ans);
            }
        }

        return ""; // No possible larger string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String s = sc.next();

        String result = getNextFileName(n, k, s);
        System.out.println(result);
    }
}
