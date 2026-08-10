import java.util.ArrayList;
public class _103_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);list.add(7); list.add(9);
        System.out.println(list);
        int element = list.get(2);
        System.out.println(element);
        list.remove(2);
        System.out.println(list);
        list.add(2,88);
        System.out.println(list);
        list.set(2,89);
        System.out.println(list);
        System.out.println(list.contains(80));
        System.out.println(list.size());
    }
}
