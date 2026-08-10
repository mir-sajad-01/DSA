import java.util.*;
public class _48_2dArray {
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.print(" the position of this number is (" + i + "," + j + ")");
                }
            }
        }
        System.out.println(" not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int m = arr.length, n = arr[0].length;
        System.out.println("Enter the elements in 2d array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);
        int key = 7;
        search(arr, key);
        sc.close();
    }
}
