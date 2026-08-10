import java.util.*;

public class _7_switch {
    public static void main(String[] args) {
        Scanner pn = new Scanner(System.in);
        char n = pn.next().charAt(0);
        int a = pn.nextInt();
        int b = pn.nextInt();
        switch (n) {
            case '+': System.out.println( a + b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break; 
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
            break;
            default:System.out.println("get out");

        }
        pn.close();

    }
}
