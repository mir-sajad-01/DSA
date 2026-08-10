public class _75_Abstract {
    public static void main(String[] args) {
        chickenn p = new chickenn();
        p.walk();
    }
    
}
abstract class Animall {
    Animall(){
        System.out.println("I am constructor 1");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animall{
    Horse(){
        System.out.println("I am constructor 2");
    }
    void eat(){
        System.out.println("Horse eats");
    }
    void walk(){
        System.out.println("horse walks");
    }
}
class chickenn extends Animall{
    chickenn (){
        System.out.println(" I am constructor 3");
    }
    void walk(){
        System.out.println("chicken walks");
    }
}
