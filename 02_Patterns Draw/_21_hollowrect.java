public class _21_hollowrect {
    // MY METHOD
    /*
    public static void hollow ( int row , int coloumn){
        for ( int i = 1  ; i <= row ; i++){
            for ( int j =1 ; j <= coloumn ; j++){
                if ( ((i==2)&&((j==2)||(j==3)||(j==4)))|| ((i==3)&&((j==2)||(j==3)||(j==4)))){
                    System.out.print(" ");
                }
                else{

                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow ( 4,5);
    }
    */
      // Madams method
      public static void hollow ( int row , int coloumn){
        for ( int i = 1  ; i <= row ; i++){
            for ( int j =1 ; j <= coloumn ; j++){
                if ((i==1 || i==row || j== 1||j==coloumn)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow ( 4,5);
    }
}
