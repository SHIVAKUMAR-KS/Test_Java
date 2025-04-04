//package HackerEarth;
//
//import java.util.*;
//
//public class Test {
//    public List<Integer> countSmaller(int[] nums) {
//        int len = nums.length;
//        List<Integer> result = new ArrayList<>(Collections.nCopies(len, 0));
//        if (len == 0) return result;
//
//        // List of indices to sort nums
//        List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < len; i++) {
//            indices.add(i);
//        }
//
//        // Merge sort the indices list and count smaller elements
//        mergeSort(nums, indices, result);
//
//        return result;
//    }
//
//    private void mergeSort(int[] nums, List<Integer> indices, List<Integer> result) {
//        if (indices.size() <= 1) return;
//
//        int mid = indices.size() / 2;
//        List<Integer> left = new ArrayList<>(indices.subList(0, mid));
//        List<Integer> right = new ArrayList<>(indices.subList(mid, indices.size()));
//
//        mergeSort(nums, left, result);
//        mergeSort(nums, right, result);
//
//        merge(nums, left, right, indices, result);
//    }
//
//    private void merge(int[] nums, List<Integer> left, List<Integer> right, List<Integer> indices, List<Integer> result) {
//        int i = 0, j = 0, count = 0;
//
//        // Merge the two sorted lists
//        while (i < left.size() && j < right.size()) {
//            if (nums[left.get(i)] <= nums[right.get(j)]) {
//                indices.set(i + j, left.get(i));
//                result.set(left.get(i), result.get(left.get(i)) + count);
//                i++;
//            } else {
//                indices.set(i + j, right.get(j));
//                count++;
//                j++;
//            }
//        }
//
//        // Add remaining elements from left or right
//        while (i < left.size()) {
//            indices.set(i + j, left.get(i));
//            result.set(left.get(i), result.get(left.get(i)) + count);
//            i++;
//        }
//
//        while (j < right.size()) {
//            indices.set(i + j, right.get(j));
//            j++;
//        }
//    }
//
//    public static void main(String[] args) {
//        Test solution = new Test();
//        System.out.println(solution.countSmaller(new int[] {3, 0, 1})); // Output: [2, 0, 1]
//    }
//}
