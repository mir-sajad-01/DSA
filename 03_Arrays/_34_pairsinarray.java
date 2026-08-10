
public class _34_pairsinarray {
    public static void pairs(int array[]) {
        int tp = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + "," + array[j]+")");
                tp ++;
            }
            System.out.println();
        }
        System.out.println("totalpairs are : " + tp);
    }

    public static void main(String[] args) {
        int array[] = { 3, 4, 9, 28, 99 };
        pairs(array);
    }
}
