package Arrays_GFG;

public class reverse_arr_in_grp {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i+=3){
            count++;
            System.out.print(arr[i]+ " ");
            System.out.println();
            System.out.print(count);
        }
        System.out.println();
    }
}
