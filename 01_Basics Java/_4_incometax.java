import java.util.*;

public class _4_incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income ");
        float income = sc.nextFloat();
        float  tax = 0 ;
        if ((income > 0 )&&(income < 500000)){

            tax = 0;
        }
        else if ((income >= 500000) && (income <= 1000000)){

            tax = (income * 0.2f);
        }
        else if (income > 1000000) {

            tax = (income * 0.3f);
        }
        else {
            System.out.println("you entered wrong income ");
        }
    
        System.out.println(" total income " + (income - tax));
        sc.close();
    }
}
