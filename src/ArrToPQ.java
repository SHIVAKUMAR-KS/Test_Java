import java.util.Arrays;
import java.util.PriorityQueue;

public class ArrToPQ {
    public static void main(String[] args) {

        Integer  arr[]={4,3,2,5};
        int n=arr.length;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Arrays.asList(arr));
        System.out.println(pq);
        while(n>0){
            System.out.println(pq.poll());
        }
    }
}
