public class _26_butterflypattern {

   /*  public static void butterfly(int n) {

      for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (j <= i || j >= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= n / 2; i--) {
            for (int j = n; j >= n / 2; j--) {
                if (j >= i || j <= n / 2 - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(8);
    }
    */

    public static void butterfly(int n ){
        // ist half
        for ( int i = 1 ; i<= n ; i++){
            // stars i 
            for ( int j = 1 ;j<=i ; j++){
                System.out.print("*");
            }
            // spaces - 2 * (n-i)
            for ( int j= 1; j<=2 *(n-i);j++){
                System.out.print(" ");
            }
            // stars -i
            for ( int j=1 ; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for ( int i = n ;i>=1; i--){
            //stars -i
            for ( int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            // spaces - 2 * (n-i)
            for ( int j = 1 ;j<= 2 * (n-i);j++){
                System.out.print(" ");
            }
            // stars - i
            for ( int j = 1 ; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(4);
    }

}
