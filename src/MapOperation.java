import java.util.HashMap;
import java.util.Map;

public class MapOperation {
    public static  void helper(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
    public static void main(String[] args) {
//        HashMap<String,Integer> map=new HashMap<>();
//
//        map.put("onion",32);
//        map.put("potato",43);
//        map.put("chilli",31);
//        map.put("powder",12);
//        map.put("tomato",76);
//
//        System.out.println(map.entrySet()); [onion=32, potato=43, powder=12, tomato=76, chilli=31]
        String s="Shivaiiva";
        helper(s);
    }
}
