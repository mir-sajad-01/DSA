
public class _30_linearSearch {
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 6, 9, 33, 90 };
        int key = 33;
        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the index of a number is " + index);
        }
    }
}
