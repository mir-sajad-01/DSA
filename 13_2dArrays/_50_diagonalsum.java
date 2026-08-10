public class _50_diagonalsum {
    public static void diagonalsum( int arr[][]){
        int sum =0;
        // the time complexity of this code is very high O(n^2);
        /* 
        for ( int i = 0 ; i < arr.length ; i++ ){
            for ( int j = 0 ; j < arr.length; j++){
                if( i == j){
                   sum += arr[i][j];
                }
                else if ( (i+j)==arr.length-1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum is " + sum);
        */
        for ( int i = 0 ; i< arr.length ;i++){
                // primary diagonal;
               
                 sum+= arr[i][i];
                 // secondary diagonal
                 if ( i!= arr.length-1-i){
                    sum+= arr[i][arr.length-1-i];
                 }

        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
         diagonalsum(arr);
    }
}
