//import java.util.*;

public class _20_pr {

    // QUESTION 1
    /*
     * public static int average(int a , int b , int c ){
     * return (a + b + c)/3;
     * 
     * }
     * public static void main(String[] args) {
     * int p = average(3,8,9);
     * System.out.println(p);
     * }
     // QUESTION 3
     public static int palindrome(int n){
         int reverse = 0;
         while ( n>0){
             int lastdigit = n % 10;
             reverse = reverse * 10 + lastdigit;
              n = n / 10;
         }
         return reverse;
     }
     public static void main(String[] args) {
         
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter youn number ");
         int number = sc.nextInt();
         if (palindrome(number) == number  ){
             System.out.println("number is palindrome ");
         }
         else {
             System.out.println(" is not palindrome");
         }
         sc.close();
         
     }
     */
    // QUESTION 2

    /*
     * public static boolean isEven(int a){
     * 
     * if ( a %2 ==0){
     * 
     * return true ;
     * }
     * else {
     * return false ;
     * }
     * }
     * public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     * System.out.println("Enter number");
     * int n = sc.nextInt();
     * 
     * 
     * if ( isEven(n)== true ){
     * System.out.println("your no. is Even");
     * }
     * else {
     * System.out.println("odd");
     * }
     * sc.close();
     */

    // QUESTION 5

    /*
     * public static int sum(int n){
     * int lastdigit = 0 ;
     * int sum = 0 ;
     * while ( n >0){
     * lastdigit = n %10;
     * sum = lastdigit + sum ;
     * n = n/10;
     * 
     * }
     * return sum;
     * }
     * public static void main(String[] args) {
     * Scanner sc = new Scanner (System.in);
     * System.out.println("Enter any number ");
     * int n = sc.nextInt();
     * System.out.println("sum of number" + n + " is " +sum(n));
     * sc.close();
     * }
     */
}
