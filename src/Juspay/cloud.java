//import java.util.*;
//
public class cloud {
//    static Map<Integer, Long> feeMap = new HashMap<>();
//
//    // Get all nodes on the path from a to b (excluding LCA)
//    public static List<Integer> getPath(int a, int b) {
//        Set<Integer> pathA = new HashSet<>();
//        List<Integer> fullPath = new ArrayList<>();
//
//        int u = a, v = b;
//        while (u != 0) {
//            pathA.add(u);
//            u /= 2;
//        }
//
//        while (!pathA.contains(v)) {
//            v /= 2;
//        }
//
//        int lca = v;
//        u = a; v = b;
//
//        while (u != lca) {
//            fullPath.add(u);
//            u /= 2;
//        }
//        while (v != lca) {
//            fullPath.add(v);
//            v /= 2;
//        }
//
//        return fullPath;
//    }
//
//    public static void updateFee(int a, int b, int x) {
//        for (int node : getPath(a, b)) {
//            feeMap.put(node, feeMap.getOrDefault(node, 0L) + x);
//        }
//    }
//
//    public static long calculateCost(int a, int b) {
//        long total = 0;
//        for (int node : getPath(a, b)) {
//            total += feeMap.getOrDefault(node, 0L);
//        }
//        return total;
//    }
//
//    // ✅ Unit test (run this to check correctness)
//    public static void main(String[] args) {
//        int[][] events = {
//                {1, 3, 4, 20},
//                {2, 1, 4},
//                {1, 3, 6, 8},
//                {2, 4, 3},
//                {1, 6, 1, 40},
//                {2, 3, 7},
//                {2, 2, 4}
//        };
//
//        List<Long> output = new ArrayList<>();
//        List<Long> expected = Arrays.asList(64L, 0L, 22L);
//
//        for (int[] event : events) {
//            if (event[0] == 1) {
//                updateFee(event[1], event[2], event[3]);
//            } else if (event[0] == 2) {
//                long cost = calculateCost(event[1], event[2]);
//                output.add(cost);
//            }
//        }
//
//        System.out.println("Your Output   : " + output);
//        System.out.println("Expected      : " + expected);
//        System.out.println(output.equals(expected) ? "✅ Test Passed" : "❌ Test Failed");
}
