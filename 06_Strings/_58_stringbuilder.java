public class _58_stringbuilder {
    public static void main(String[] args) {
        // String str = "tony";  
        StringBuilder sb = new StringBuilder(" ");
        for ( char ch = 'a';ch<='z';ch++){
             sb.append(ch);
            // str+= ch;   // this will make your codes time-c very high 
        }
        System.out.println(sb.length());
    }
}
