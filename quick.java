public class quick {
    public static void printarr(int arr[]){
        for(int i = 0 ;i<arr.length ;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void quicksort(int si, int ei, int arr[]) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(si, ei, arr);
        quicksort(si, pidx-1,arr);
        quicksort(pidx+1,ei,arr);
    }


    public static int partition(int si, int ei, int arr[]) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i ;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 3, 1, 6 };
        quicksort(0, arr.length - 1, arr);
        printarr(arr);
    }
}
