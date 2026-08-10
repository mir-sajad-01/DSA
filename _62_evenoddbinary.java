public class _62_evenoddbinary{
    public static void main(String[] args) {
        int n = 46;
        int bitmask = 1;
        if ( (n & bitmask) == 0 ){
           System.out.println("Even ");
        }
        else{
            System.out.println("odd");
        }
    }
}