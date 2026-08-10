
public class _32_binarysearch {
    public static int binarysearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 5, 7, 8, 9,89,677};
        int key = 876;
        int index = binarysearch(array, key);
        if ( index == -1){
            System.out.println("wrong number" );
        }
        else{

            System.out.println("The index  " + key + " of is " + index);     
        }
    }
}
