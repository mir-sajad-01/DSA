import java.util.*;

public class _2_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        System.out.println("enter value a ");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter radius ");
        float r = sc.nextFloat();
        int sum = a + b;
        int product = a * b;
        System.out.println(sum);
        System.out.println(product);
        float area = 3.14f * r * r;
        System.out.println("Area of circle " + area);
        sc.close();
    }
}
