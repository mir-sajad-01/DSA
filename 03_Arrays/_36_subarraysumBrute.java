
public class _36_subarraysumBrute {
    public static void subarray(int array[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;  
                int sum = 0; 
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " "); 
                     sum += array[k];
                    }
                    System.out.print(" sum of this pairs is " +sum);
                    if ( sum >= max){
                       max = sum;
                    }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs are " + ts);
        System.out.println("Max sum is " + max);
    }

    public static void main(String[] args) {
        int array[] = { 3,4,5,6,8,9};
        subarray(array);
    }
}
