public class _80_printInc {
    public static void printinc(int n){
        if ( n==1){
            System.out.println(n);
            return ;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printinc(10);
    }
}
/* 
main method is called with printinc(10).
printinc(10) is called.
Since n is not equal to 1, it calls printinc(9).
Since n is not equal to 1, it calls printinc(8).
This continues until printinc(1) is called.
In printinc(1), it prints 1 and returns.
Now, control goes back to printinc(2) and it prints 2.
Control goes back to printinc(3) and it prints 3.
This continues until printinc(10) is reached, printing each value from 1 to 10.
So, the output of the program will be:
*/