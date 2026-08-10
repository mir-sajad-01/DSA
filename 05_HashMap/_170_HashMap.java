import java.util.*;
public class _170_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap <>();
        // put function 
        hm.put("India",32);
        hm.put ("Pakistan",44);
        hm.put ("china",38);
        // print hashmap
        System.out.println(hm);
        // get function
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Nepal")); // null
        // contains
        System.out.println(hm.containsKey("Pakistan")); // true
        System.out.println(hm.containsKey("Nepal")); // false
        // remove
        System.out.println(hm.remove("India")); // 32
        System.out.println(hm.remove("Nepal"));// null
        // isEmpty
        System.out.println(hm.isEmpty()); // false
        // size
        System.out.println(hm.size());  // 2
        // clear
       // hm.clear();
        System.out.println(hm.isEmpty()); // true
        System.out.println(hm.keySet());
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String k : keys){
            System.out.println("key = "+k+",value = "+hm.get(k));
        }

    }
}
