import java.util.*;
public class _104_arraylistqs {
    public static void reverse(ArrayList<Integer> list){
         for ( int i = list.size()-1 ; i>= 0;i--){
            System.out.print(list.get(i)+" ");
         }
         System.out.println();
    } 
    public static int greatest(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i < list.size();i++){
            if ( list.get(i)> max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void swap(ArrayList<Integer> list, int indx1 , int indx2){
        int temp = list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2 , temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(99);
        list.add(5);
        list.add(6);
        System.out.println(" ArrayLIst");
        System.out.println(list);
        // Reverse Order
        System.out.println();
        System.out.println("Reverse Order");
        System.out.println();
        reverse(list);
        // Greates Number
        System.out.println();
        System.out.println("Greates Number");
        System.out.println();
        System.out.println(greatest(list));
        // Swap
        System.out.println();
        System.out.println("Swapping");
        System.out.println();
        swap(list,1,3);
        System.out.println(list);
        // Sorting in ascending order
        System.out.println("Ascending Order");
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
        // Sorting in decending order
        System.out.println();
        System.out.println("Descending Order");
        System.out.println();
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
