package DESI_QNA.Hashing.Amazon_Sesssion;

import  java.util.*;
public class amazonSession {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Map<Character, Long> mp1 = new HashMap<>();  // for string s
        Map<Character, Long> mp2 = new HashMap<>();  // for string t

        // Count frequencies in s
        for (int i = 0; i < s.length(); i++) {
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0L) + 1);
        }

        // Count frequencies in t
        for (int i = 0; i < t.length(); i++) {
            mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i), 0L) + 1);
        }

        long cnt = Long.MAX_VALUE;


        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);

            if (!mp1.containsKey(currentChar)) {
                // If the current character of t is not found in s, return 0
                System.out.println(0);
                return;
            }

            long val = mp1.get(currentChar) / mp2.get(currentChar);
            cnt = Math.min(cnt, val);
        }

        // Output the result
        System.out.println(cnt);
    }
}
