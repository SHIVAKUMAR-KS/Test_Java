import java.util.HashSet;
import java.util.Scanner;

public class TripletSum {
    public static  boolean hasTripletSum(int arr[],int target){
        int n= arr.length;
        for(int i=0;i<n-2;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int second=target-arr[i]-arr[j];
                if(set.contains(second)){
                    return true;
                }
                set.add(arr[j]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        if (hasTripletSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
