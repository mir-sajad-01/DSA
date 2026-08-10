public class _81_factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
/* 
main method
is called

with factorial(5).
factorial(5) is called.
Since n is not equal to 0, it returns 5 * factorial(4).
factorial(4) is called.
It returns 4 * factorial(3).
factorial(3) is called.
It returns 3 * factorial(2).
factorial(2) is called.
It returns 2 * factorial(1).
factorial(1) is called.
It returns 1 * factorial(0).
factorial(0) is the base case and returns 1.
So, 1 * 1 is returned.
2 * 1 is returned.
3 * 2 is returned.
4 * 6 is returned.
5 * 24 is returned.
The final result of factorial(5) is printed, which is 120.
*/