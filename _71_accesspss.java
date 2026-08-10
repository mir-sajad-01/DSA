public class _71_accesspss {
    public static void main(String[] args) {
        Pens p1 =new Pens  ();
        p1.passwords("abcde");
        System.out.println(p1.getpss());
    }
}
class Pens{
        private String password;
   
         void passwords(String newpassword){
           password = newpassword;
        }
         String getpss(){
            return this.password;
        }
}

