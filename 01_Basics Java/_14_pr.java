import java.util.*;

public class _14_pr {
    public static void main(String[] args) {
        // // QUESTION 1
        // /*
        // * for ( int i = 0 ; i< 5 ; i++){
        // * System.out.println("hello");
        // * i+=2;
        // * }
        // */

        // // QUESTION 2
        // int sum = 0, sum2 = 0;
        // int n = 30;
        // System.out.println("Even numbers");
        // for (int i = 1; i < n; i++) {
        // if (i % 2 == 0) {
        // System.out.print(i + " ");
        // sum = sum + i;
        // }
        // }
        // System.out.println();
        // System.out.println( "sum of numbers is "+ sum);
        // System.out.println();
        // System.out.println("Odd numbers");
        // for (int i = 1; i < n; i++) {
        // if (i % 2 == 1) {
        // System.out.print(i + " ");
        // sum2 = sum2 + i;

        // }

        // }
        // System.out.println();
        // System.out.println("sum of numbers is " + sum2);

        Scanner sc = new Scanner(System.in);
        // int sum1 = 0;
        // int sum2 = 0;
        // System.out.println("Enter the number of integers");
        // int n = sc.nextInt();
        // for ( int i = 1 ; i <= n ; i++){
        // int num = sc.nextInt();
        // if ( num % 2 == 0){
        // sum1 = sum1 + i;
        // }
        // if (num %2== 1){
        // sum2 = sum2 + i;
        // }
        // }
        // System.out.println("sum of even numbers " + sum1 );
        // System.out.println("sum of odd numbers " + sum2);

        // QUESTION 2 using do while 
        /* 
        System.out.println("Enter the number of integers ");
        int n = sc.nextInt();
        int sum1 = 0 , sum2 = 0;
        System.out.println("Enter you integers");
        int i = 1;
        do {
            
                 int p = sc.nextInt();
                 if ( p % 2 == 0){
                    sum1 = sum1 + p;
                 }
                 else {
                    sum2 = sum2 + p;
                 }
                 i++;
             
         } while ( i <= n);
         System.out.println("sum of even numbers is " + sum1);
         System.out.println("sum of odd numbers is "+ sum2);
         */
              // QUESTION 2 using while loop
        /*System.out.println("Enter the number of integers ");
        int n = sc.nextInt();
        int sum1 = 0 , sum2 = 0;
        System.out.println("Enter you integers");
        int i = 1;
        
        while ( i <= n){
            
            int p = sc.nextInt();
            if ( p % 2 == 0){
                sum1 = sum1 + p;
            }
            else {
                sum2 = sum2 + p;
            }
            i++;
        }
        System.out.println("sum of even numbers is " + sum1);
        System.out.println("sum of odd numbers is "+ sum2);
        */
        // QUESTION 3
        /* 
        System.out.println("Enter number for factorial");
        int n = sc.nextInt();
        int i = 1 ; 
        int factorial = 1;
        do {
            factorial = factorial * i;
            i++;
        }while (i<=n);
        System.out.println(factorial);
        */

        // QUESTION 4
        /* 
        System.out.println("Enter no.");
        int n= sc.nextInt();
        System.out.println("MULTIPLICATION TABLE OF "+n);
        for ( int i = 0 ; i<= 10 ; i++ ){
            System.out.println(n + " x " + i + " = " + n * i);
        }
        */

        sc.close();
        

    }
}
