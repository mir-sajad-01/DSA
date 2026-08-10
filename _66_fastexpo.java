public class _66_fastexpo {
    public static int fastexponentiation ( int a, int n ){
        int ans = 1;
          while ( n>0){
            if ((n & 1) == 1){
                ans = ans * a;
            }
            a = a* a;
            n = n>>1;
          }
          return ans ;
    }
    public static void main(String[] args) {
        System.out.println(fastexponentiation(5,3));
    }
}
