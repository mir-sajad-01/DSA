public class _74_overloadriding {
    // overloading
    /* 
    public static void main(String[] args) {
        calculator calc = new calculator ();
        System.out.println(calc.sum(3,4));
        System.out.println(calc.sum(3.2,2.2));
        System.out.println(calc.sum("sajad"," hi"));
    }
}
class calculator {
    int sum ( int a , int b){
        return a + b ;

    }
    double sum ( double a , double b){
        return a + b ;
    }
    String sum ( String a , String b){
        return a + b;
    }
}
*/

// overriding

public static void main(String[] args) {
    deer dr = new deer();
    dr.eat();
    animal1 an = new animal1();
    an.eat();
}
}
class animal1{
    void eat(){
        System.out.println("eats animal");
    }
}
class deer extends animal1{
    void eat(){
        System.out.println("eats deer");
    }
}

