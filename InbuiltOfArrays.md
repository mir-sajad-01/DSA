1. Arrays.toString()

Convert array → readable string

import java.util.Arrays;

int[] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr));

Output:

[1, 2, 3]
🔹 2. Arrays.sort()

Sort array

int[] arr = {5, 2, 8, 1};
Arrays.sort(arr);

System.out.println(Arrays.toString(arr));

Output:

[1, 2, 5, 8]
🔹 3. Arrays.binarySearch()

Search element (array must be sorted)

int[] arr = {1, 2, 5, 8};
System.out.println(Arrays.binarySearch(arr, 5));

Output:

2

(index of 5)

🔹 4. Arrays.equals()

Compare two arrays

int[] a = {1, 2, 3};
int[] b = {1, 2, 3};

System.out.println(Arrays.equals(a, b));

Output:

true
🔹 5. Arrays.fill()

Fill array with same value

int[] arr = new int[5];
Arrays.fill(arr, 7);

System.out.println(Arrays.toString(arr));

Output:

[7, 7, 7, 7, 7]
🔹 6. Arrays.copyOf()

Copy array

int[] arr = {1, 2, 3};
int[] newArr = Arrays.copyOf(arr, 5);

System.out.println(Arrays.toString(newArr));

Output:

[1, 2, 3, 0, 0]
🔹 7. Arrays.copyOfRange()

Copy part of array

int[] arr = {1, 2, 3, 4, 5};
int[] newArr = Arrays.copyOfRange(arr, 1, 4);

System.out.println(Arrays.toString(newArr));

Output:

[2, 3, 4]
🔹 8. Arrays.asList()

Convert array → list

Integer[] arr = {1, 2, 3};
System.out.println(Arrays.asList(arr));

Output:

[1, 2, 3]
🔹 9. Arrays.deepToString()

For 2D arrays

int[][] arr = {{1,2}, {3,4}};
System.out.println(Arrays.deepToString(arr));

Output:

[[1, 2], [3, 4]]
🔹 10. Arrays.deepEquals()
int[][] a = {{1,2}, {3,4}};
int[][] b = {{1,2}, {3,4}};

System.out.println(Arrays.deepEquals(a, b));

Output:

true
🔹 11. Arrays.parallelSort()

Faster sorting (multithreading)

int[] arr = {5, 3, 1, 4};
Arrays.parallelSort(arr);

System.out.println(Arrays.toString(arr));

Output:

[1, 3, 4, 5]
🔹 12. Arrays.stream()

Convert array → stream

int[] arr = {1, 2, 3};

int sum = Arrays.stream(arr).sum();
System.out.println(sum);

Output:

6