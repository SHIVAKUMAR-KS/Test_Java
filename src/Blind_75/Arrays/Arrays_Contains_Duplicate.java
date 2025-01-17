package Blind_75.Arrays;

/*
public class Arrays_Contains_Duplicate {
    //Tc : O(N^2)
    //Sc : O(1)
    static boolean checkDuplicates(int[] arr) {
        int n = arr.length;

        // Outer loop to pick each element one by one
        for (int i = 0; i < n - 1; i++) {

            // Inner loop to compare the current element
            // with the rest of the elements
            for (int j = i + 1; j < n; j++) {

                // If a duplicate is found Return true
                if (arr[i] == arr[j])
                    return true;
            }
        }

        // If no duplicates are found, return false
        return false;
    }
    //Tc : O(N)
    //Sc : O(N)
    class Solution {
        public boolean checkDuplicates(int arr[]) {
            // Code here
            int n=arr.length;
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){

                if(set.contains(arr[i])){
                    return true;
                }else{
                    set.add(arr[i]);
                }
            }
            return false;
        }
    }


}


 */
