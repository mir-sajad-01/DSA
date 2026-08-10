
public class _33_reversearray {
   public static void reverse( int array[]){
    int start = 0 ; int last = array.length -1 ;
    while ( start < last){
       int temp = array[last];
       array[last] = array[start];
       array[start] = temp; 
       start ++ ;
       last--;
    }
   } 
   public static void main(String[] args) {
       int array[] = { 3, 8,9,23,43,48};
       reverse(array);
       for ( int i = 0 ; i < array.length ; i++){
          System.out.print(array[i]+" ");
       }
       System.out.println();
   }
}
