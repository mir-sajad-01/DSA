// public class _41_bubblesort {
//     public static void bubble(int array[]) {
//         int n = array.length;
//         for (int turns = 0; turns < n - 1; turns++) {
//             for (int j = 0; j < n - 1 - turns; j++) {
//                 if (array[j] > array[j + 1]) {
//                     int temp = array[j];
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                 }
//             }
//         }
//         for ( int i = 0 ; i < n; i++){
//             System.out.print(array[i]+ " ");
//         }
//     }
//     public static void main(String[] args) {
//         int array[] = { 2, 5, 1,4 ,3};
//         bubble (array);

//      }
// }

public class _41_bubblesort {
    public static void bubble(int array[]) {
        int n = array.length;
        boolean swapped;

        for (int turns = 0; turns < n - 1; turns++) {
            swapped = false;

            for (int j = 0; j < n - 1 - turns; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // 🔥 Optimization: stop if no swaps happened
            if (!swapped) {
                break;
            }
        }

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 5, 1, 4, 3};
        bubble(array);
    }
}

// recursive bubble sort

// class Solution {
//     public static void bubbleSort(int[] arr, int n) {
//         // Base case
//         if (n == 1) return;

//         boolean swapped = false;

//         // One pass
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 int temp = arr[i];
//                 arr[i] = arr[i + 1];
//                 arr[i + 1] = temp;
//                 swapped = true;
//             }
//         }

//         // Optimization: stop if already sorted
//         if (!swapped) return;

//         // Recursive call for remaining array
//         bubbleSort(arr, n - 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         bubbleSort(arr, arr.length);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }