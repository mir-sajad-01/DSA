// import java.util.arrays;
import java.util.Arrays;

import java.util.Collections;

public class _45_inbuiltsort {
    public static void inbuilt(Integer array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int array[ ] = { 5,4,1,3,2};
        // Arrays.sort(array,0 , 3);
        Integer array[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(array, 0, 3, Collections.reverseOrder());
        inbuilt(array);
    }
}
