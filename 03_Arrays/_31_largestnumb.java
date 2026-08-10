

public class _31_largestnumb {
    /* 
    public static int  largest(int arry[]){
        int largest = arry[0];
        for ( int i = 0 ; i<arry.length ; i++){
            if (arry[i]>= largest){
               largest = arry[i];
            }
        }
        return largest ;
    }
    public static int index(int arry[],int key){
        for ( int i = 0 ;i < arry.length ; i++){
            if ( arry[i]==key){
                return i ;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int arry[] = { 3, 8,9,29,2,};
        int key  = largest(arry);
        System.out.print("The largest number of the array is " + key);
         int index = index ( arry,key);
         if ( index == 1){
            System.out.print("not found ");
         }
         else {
            System.out.print(" with index "+index);
         }
        
    }
    */

    // madams code

    public static void   largest(int arry[]){
        int largest = Integer.MIN_VALUE;  // - infinity 
        int smallest = Integer.MAX_VALUE; // + infinity
        for ( int i = 0 ; i<arry.length ; i++){
            if (arry[i]>= largest){
                largest = arry[i];
            }
            if (smallest>arry[i]){
                smallest = arry[i];
            }
        }
   
        System.out.println("The largest number in the array is " + largest);
        System.out.println("The smallest number int the array is "+smallest);
    }
 
    public static void main(String[] args) {
        int arry[] = { 3, 8,9,29,2,};   
        largest (arry);
}
}
