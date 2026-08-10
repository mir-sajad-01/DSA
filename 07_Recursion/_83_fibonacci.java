public class _83_fibonacci {
    public static int fibo(int n){
        if ( n ==0 || n== 1){
            return n ;
        }
        return fibo(n-1) + fibo(n- 2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
/* 
The fibo method is a recursive function to calculate the nth term of the Fibonacci sequence.

In the main method, fibo(5) is called.

The fibo(5) call breaks down into:

fibo(4) + fibo(3)
fibo(3) + fibo(2)
fibo(2) + fibo(1)
fibo(1) + fibo(0)
fibo(1) returns 1
fibo(0) returns 0
fibo(2) evaluates to fibo(1) + fibo(0) = 1 + 0 = 1
fibo(1) returns 1
fibo(3) evaluates to fibo(2) + fibo(1) = 1 + 1 = 2
fibo(4) evaluates to fibo(3) + fibo(2) = 2 + 1 = 3
Finally, fibo(5) evaluates to fibo(4) + fibo(3) = 3 + 2 = 5.

Therefore, the output of this program when calling fibo(5) is 5. If you run the program, it should print 5 to the console.






*/