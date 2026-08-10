/*
public class _87_xpowern {
    public static int power(int x , int n){
        if ( n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
*/

// optimized
public class _87_xpowern {
    public static int power(int x , int n){
        if ( n==0){
            return 1;
        }
        int halfpower = power(x ,  n/2);
        int fullpower = halfpower * halfpower ;
        if ( x %2 != 0){
            return x * fullpower ;
        }
        return fullpower;
    }
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}