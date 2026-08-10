import java.util.*;
public class _11_break {
    public static void main(String[] args) {
       Scanner p = new Scanner ( System.in);
       do{
        System.out.println("enter no.");
        int n = p.nextInt();
        if ( n%10==0){
            break;
        }
        System.out.println(n);
       } while ( true);
       p.close();
    }
}
