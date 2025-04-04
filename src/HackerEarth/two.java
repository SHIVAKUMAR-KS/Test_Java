//package HackerEarth;
//
//import java.util.*;
//
//public class two {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine(); // Consume the newline
//
//        while (t-- > 0) {
//            String[] input = sc.nextLine().split(" ");
//            String A = input[0];
//            String B = input[1];
//
//            System.out.println(countCommonSubstrings(A, B));
//        }
//        sc.close();
//    }
//
//    private static int countCommonSubstrings(String A, String B) {
//        Set<String> substringsA = generateSubstrings(A);
//        Set<String> substringsB = generateSubstrings(B);
//
//        // Find intersection of both sets
//        substringsA.retainAll(substringsB);
//
//        return substringsA.size();
//    }
//
//    private static Set<String> generateSubstrings(String s) {
//        Set<String> substrings = new HashSet<>();
//        int n = s.length();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                substrings.add(s.substring(i, j));
//            }
//        }
//
//        return substrings;
//    }
//}