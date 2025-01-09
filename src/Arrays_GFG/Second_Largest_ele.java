package Arrays_GFG;

import java.util.Arrays;

public class Second_Largest_ele {
    public static void main(String[] args) {
        int arr[]={4,5,2,9,6};
        int n=arr.length;
        Arrays.sort(arr);//2,4,5,6,9

        //as we know the  n-1 will be the second largest
       // System.out.println(arr[n-2]);
        for(int i=n-2;i>=0;i--){
            if(arr[i] !=arr[n-1]){
                System.out.println(arr[i]);
            }
        }
    }
}
