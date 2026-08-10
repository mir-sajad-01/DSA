import java.util.*;
public class _107_rotatedArraylst {
    // if we have to find sum of two number equal to target in sorted arraylist
    /*
    public static boolean sum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
     */
    // Optimized approach of above 
    /*
         public static boolean sum2(ArrayList<Integer> list, int target) {
          int rp = list.size()-1;
          int lp = 0 ;
          while(lp!=rp){
            if(list.get(lp)+ list.get(rp) == target){
                return true;
            }
            if(list.get(lp)+ list.get(rp) < target ){
                lp ++;
            }
             else{
                rp --;
             }
          }
          return false;
    }
     */
    // if we rotate arraylist at any point ;
    public static boolean rotate(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i; // breaking point
                break;
            }
        }
        int lp = bp + 1; // smallest
        int rp = bp; // largest
        while (rp != lp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;

            } else {
            // case3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(rotate(list, target));
    }
}