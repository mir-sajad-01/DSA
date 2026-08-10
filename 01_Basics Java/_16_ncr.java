public class _16_ncr {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int bc ( int n , int r){
        int factn = fact(n);
        int factr = fact (r);
        int factnmr = fact (n-r);
        int binc = factn / (factr*factnmr);
        return binc ;
    }
    public static void main(String[] args) { 
        int p = bc ( 8,4);
        System.out.println(p);
    }
}
