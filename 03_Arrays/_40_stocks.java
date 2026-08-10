
public class _40_stocks {
    public static int stocks(int array[]) {
        int buying = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < array.length; i++) {
            if (buying < array[i]) {
                int profit = array[i] - buying;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buying = array[i];
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int array[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("max profit is " + stocks(array));

    }
}