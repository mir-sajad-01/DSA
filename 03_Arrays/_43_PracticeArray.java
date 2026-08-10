
//import java.util.*;

public class _43_PracticeArray {
   /*  public static boolean twice(int array[]){
        for ( int i= 0; i < array.length -2 ; i++){
            for ( int j = i+1 ; j < array.length ; j++){
                if ( array[i]== array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of elements for array");
        int n = sc.nextInt();
        System.out.println(" Enter elements of array");
        int nums[]  = new int [n];
        for ( int i = 0 ; i < n; i ++){
            nums[i] = sc.nextInt();
        }
        System.out.println(twice ( nums));
        sc.close();
    }
    */
   
    // QUESTION 3
    /* 
    public static int price(int prices[]){
    int buy = prices[0];
    int profit = 0;
    for (int i=1; i<prices.length; i++) {
    if (buy < prices[i]) {
    profit = Math.max(prices[i] - buy, profit);
    }
    else {
    buy = prices[i];
    }
    }
    return profit;
    }
   public static void main(String[] args) {
    int prices[] = {7,2,4,9,2};
    System.out.println(price(prices)); 
   
   }
   */
    
   // QUESTION 4
   /* 
   public static int water(int height[]){
      int n = height.length;
      int leftmax[ ] = new int [n];
      leftmax[0] = height[0];
      for ( int i = 1 ; i<n ; i++){
        leftmax [i]= Math.max (leftmax[i-1],height[i]);
      }
      int rightmax [] = new int [n];
      rightmax[n-1] = height[n-1];
      for ( int i = n-2 ; i>=0 ; i--){
        rightmax[i] = Math.max(rightmax[i+1],height[i]);
      }
      int tw = 0 ;
      for (int i = 0 ; i < n ; i++){
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        tw += waterlevel - height[i];
      }
      return tw;
   }
   public static void main(String[] args) {
    int height[] = {4, 2, 0, 3, 2, 5};
    System.out.println(water (height));
   }
   */

   // QUESTION 5

}
