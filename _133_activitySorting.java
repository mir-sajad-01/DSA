import java.util.*;

public class _133_activitySorting {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 4, 2, 7, 9, 6, 9};
        int Activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            Activities[i][0] = i;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }
        // lambda function --> short form
        Arrays.sort(Activities, Comparator.comparingInt(o -> o[2]));
        
        ArrayList<Integer> ans = new ArrayList<>();
        //ist activity
        int ma =1 ;
        ans.add(Activities[0][0]);
       
        int le = Activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (Activities[i][1] >= le) {
                ma++;
                ans.add(Activities[i][0]);
                le = Activities[i][2];
            }
        }
        System.out.println("max activities " + ma);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
