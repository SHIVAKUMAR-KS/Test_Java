import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        //Increasing order
        //list.sort((a,b)->a-b);
        //Decreasing order
       // list.sort((a,b)->b-a);
        Collections.sort(list);

        System.out.println(list);


    }
}
