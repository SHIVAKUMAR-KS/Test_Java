package PS_Sprint_1;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {
    public static int helper(int arr[],int n){
        Arrays.sort(arr);
        return arr[n-2];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n Value:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res=helper(arr,n);
        System.out.println(res);
    }
}
