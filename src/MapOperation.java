import java.util.HashMap;

public class MapOperation {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("onion",32);
        map.put("potato",43);
        map.put("chilli",31);
        map.put("powder",12);
        map.put("tomato",76);

        System.out.println(map.entrySet());
    }
}
