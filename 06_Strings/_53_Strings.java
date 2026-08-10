
public class _53_Strings {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1);
        String str = new String ("hello");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));

    
        for ( int i = 0 ; i < str.length();i++){
             System.out.print(str.charAt(i));
             System.out.print(" ");
        }

    }
}
