import java.util.*;
public class _176_HashLinkedhsTreehs{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Mumbai");
        hs.add("Delhi");
        hs.add("Bengaluru");
        hs.add("Noida");
        System.out.println(hs);
        LinkedHashSet<String> lh  = new LinkedHashSet<>();
        lh.add("Mumbai");
        lh.add("Delhi");
        lh.add("Bengaluru");
        lh.add("Noida");
        System.out.println(lh);
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Delhi");
        ts.add("Bengaluru");
        ts.add("Noida");
        System.out.println(ts);
    }
}