public class _68_oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.name= "sajad";
        System.out.println(p1.name);
        p1.password("abcde");
        p1.age(34);
        System.out.println(p1.password);
        System.out.println(p1.age);
    }
}
class Pen{
        String name ;
        String password;
        int age ;
        public void password(String password){
            this.password = password;
        }
        public void age ( int age){
            this.age = age;
        }
}
