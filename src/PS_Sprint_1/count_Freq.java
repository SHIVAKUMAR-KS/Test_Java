package PS_Sprint_1;

import java.util.HashMap;

public class count_Freq {
    public static int solve(int arr[],int k){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==k){
                return num;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1, 7, 4, 3, 4, 8, 7};
        int k=2;
        int ans=solve(arr,k);
        System.out.println(ans);
    }
}
