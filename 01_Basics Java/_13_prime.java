import java.util.*;

public class _13_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. for check ");
        int n = s.nextInt();
        boolean isprime  = true;
        if (n == 2) {
            System.out.println("prime ");
        } else {

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime  == false) {
                System.out.println(" not prime");
            } else {
                System.out.println("prime ");
            }
        }
        s.close();

    }
}
