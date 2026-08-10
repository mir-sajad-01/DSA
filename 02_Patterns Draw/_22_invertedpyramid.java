public class _22_invertedpyramid{
    // my code
    /*public static void inverpy(int row , int coloumn){
        for ( int i = 1 ;i <= row ; i++){
            for ( int j =1 ;j<=coloumn ; j++){
                if ( j <row-i+1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverpy(6,5);
        
    }*/
    // madams code
    public static void invertpy(int n ){
        for ( int i = 1; i <= n ; i++){
            for ( int j = 1 ; j <= n-i; j++){
                 System.out.print(" ");
            } 
            for ( int j = 1  ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertpy(8);
    }
}