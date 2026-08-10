
public class _49_spiralmatrix {
    public static void spiral(int arr[][]) {
      
         // My try;

       /* 
             while (sr < er-1 && sc < ec-1) {
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            for (int i = ec - 1; i >= 0; i--) {
                System.out.print(arr[er][i] + " ");
            }
            for (int i = er - 1; i > 0; i--) {
                System.out.print(arr[i][sc] + " ");
            }
            for (int i = sc + 1; i < ec; i++) {
                System.out.print(arr[sr + 1][i] + " ");
            }
            for (int i = ec - 1; i > 0; i--) {
                System.out.print(arr[sr + 2][i] + " ");
            }
          sr= er+1;
        }
        */

          // Madam

          int startrow = 0 ; 
          int startcol  = 0 ; 
          int endrow = arr.length -1;
          int endcol = arr[0].length -1;
          while ( startrow<= endrow && startcol <= endcol){
            // top 
             for ( int j = startcol; j<= endcol ; j++){
                System.out.print(arr[startrow][j] + " ");
             }
             //right
             for ( int i = startrow+1 ; i<= endrow ; i++){
                System.out.print(arr[i][endcol] + " ");
             }
             // bottom 
             for ( int j=endcol-1; j>=startcol;j--){
                if ( startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
             }
             //left
             for (int i = endrow-1; i>=startrow+1;i--){
                if (startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
             }
             startcol++;
             startrow++;
             endcol--;
             endrow--;

          }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{13,14,15,16} };
        spiral(arr);
    }
}
