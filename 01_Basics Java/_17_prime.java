public class _17_prime {
    public static boolean prime(int n ){
      /*   boolean isprime = true ;
        // corner case
        if ( n == 2){
            isprime = true ;
        }
        for ( int i = 2 ; i < n ; i++){
            if ( n % i == 0){
             isprime = false ;
             break;
            }
        }
        return isprime  ;
    } */
     
    // optimized loop
     
        // corner case
        if ( n == 2){
            return true ;
        }
        for ( int i = 2 ; i <= Math.sqrt(n) ; i++){
            if ( n % i == 0){
             return false ;
            }
        }
        return true ;
    }
    public static void range (int n ){
        for ( int i = 2 ; i <= n; i ++){
                if ( prime(i)){
                    System.out.print(i+" ");

                }
        }
    }
    public static void main(String[] args) {
        range(20);
    }
}
