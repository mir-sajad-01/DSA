public class _51_searchinsortedmatrix {
    public static boolean sorted(int arr[][],int key){
        int row = 0;
        int col = arr.length-1;
        while ( row<arr.length && col>=0 ){
             if ( arr[row ][col] == key){
                System.out.println("position is ("+row+","+col+")");
                return true ;
             }
            else if ( arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
        
    }
    public static void main(String[] args) {
        int arr[][ ]= {
                       {10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}
                      };
        int key = 33;
        sorted(arr,key);
    }
}
