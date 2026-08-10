public class _92_Practicerecursion {
    /* 
    public static void indices(int arr[],int key,int i ){
        int l = arr.length;
        if ( i == l){
            return ;
        }
        if ( arr[i]==key){
            System.out.print(i +" ");
        }
        indices(arr,key,i+1);
    
    }
    public static void main(String[] args) {
        int arr[]= {3,2,4,5,6,2,7,2,2};
        int key = 2;
        indices(arr,key,0);

    }
    */
    /* 
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigits(int n ){
        if ( n==0){
            return ;
        }
        int lastdigit = n%10;
        printdigits(n/10);
        System.out.print(digits[lastdigit]+" ");
    }
     
    public static void main(String[] args) {
        printdigits(1234);
        System.out.println();
    }
    */
    /* 
    public static void length(String str , StringBuilder sb,int i , int count ){
        if ( sb.toString().equals(str)){
            System.out.println(count);
            return ;
        }
        sb.append(str.charAt(i)) ;
        length(str, sb,i+1, count+1 );
    }
   
    public static void main(String[] args) {
        
        String name = "sajad";
        length (name,new StringBuilder(""),0,0);
    }
    */
    /* 
    public static void print(String str,int n){
        if( n < 0){
            return;
        }
        print(str.substring(n),0)
      }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length() ;
        print(str,n);
    }
}
*/
}