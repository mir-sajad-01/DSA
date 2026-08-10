public class _47_PracticeSort {
    public static void sorting(int arr[]) {
        // Bubble sort

       /* for (int i = 0; i < arr.length - 1; i++) {
           for (int j = 0; j < arr.length-1-i; j++) {
               if (arr[j] < arr[j + 1]) {
                   int temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
               }
           }
       } */

       // Selection sort

       /*for (int i = 0 ; i < arr.length -1  ; i++){
           int max = i;
           for ( int j = i +1; j < arr.length  ; j++){
               if ( arr[j] > arr[max]){
                    max = j;
               }
           }
           int temp =arr[i];
           arr[i] = arr[max]  ;
            arr[max ] = temp;
           
       }*/

       // inertion sort
    
       /*for ( int i = 1 ;i < arr.length ; i++){
           int curr = arr[i];
           int prev = i-1;
           while ( prev>=0 && arr[prev]<curr){
               arr[prev+1] = arr[prev];
               prev--;
           }
           arr[prev+1] = curr;
       }*/
       
       // counting sort 
       /* 
        int largest = Integer.MIN_VALUE;
       for(int i= 0 ; i < arr.length ;i++){
            largest = Math.max( arr[i] , largest);
       }
       int count[] = new int [largest+1];
       for ( int i = 0 ; i< arr.length ; i++){
           count[arr[i]] ++;
       }
       int j = 0 ;
        for ( int i = count.length-1 ; i >0; i--){
           while ( count[i] > 0 ){
               arr[j] = i;
               j++;
               count[i]--;
           }
        }
        */
   }

   public static void print(int arr[]) {
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }

   public static void main(String[] args) {
       int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
       sorting(arr);
       print(arr);
   }
}
