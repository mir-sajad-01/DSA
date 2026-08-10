
public class _35_subarray {
    public static void subarray(int array[]) {
        int ts = 0;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;   
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");      
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs are " + ts);
    }

    public static void main(String[] args) {
        int array[] = { 3, 8, 9, 23, -99, -90 };
        subarray(array);
    }
}
