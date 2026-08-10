import java.util.*;
public class _54_stringpalindrome {

   public static boolean ispalindrome(String str){
        for ( int i = 0 ; i < str.length( )/2; i++){
             if ( str.charAt(i)!=str.charAt(str.length()-1-i)){
                 return false;
             }
        }
        return true;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter the word");
        String str = sc.next();
        System.out.println(ispalindrome(str));
        sc.close();
    }
}
