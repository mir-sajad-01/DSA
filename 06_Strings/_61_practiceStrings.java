//  import java.util.*;
public class _61_practiceStrings {
    
   /* 
    public static int vowels( String str){
        int count = 0;

        for ( int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
              if ( ch== 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
              }
          }
        
         return count ;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = sc.nextLine();
        System.out.println(vowels(str));
        sc.close();
    }
    */
    public static boolean equals(String str1 , String str2){
        for (int i =0 ; i < str1.length(); i++){
           for ( int  j=0 ;  j<str2.length();j++){
            if (str1.charAt(i)==str2.charAt(j)){
                 return true;
            }
           }
        }
        return false;
    }
    public static void main(String[] args) {
         String str1 = "races";
         String str2 = "care";
         System.out.println(equals(str1,str2));

    }
}



