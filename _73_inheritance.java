public class _73_inheritance {
    public static void main(String[] args) {
        trout tr = new trout();
        tr.hrate();
        tr.swim();
        tr.eat();
        tr.breathe();

        kantor kn = new kantor();
        kn.kantorvs();

    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}
// up to this they are single inheritance

// now multiple inheritance
class trout extends Fish {
    void hrate() {
        System.out.println(" trout fish are very high rated");
    }
}
// heirarchial inheritance
class kantor extends Animal {
    void kantorvs() {
        System.out.println("found in kashmir");
    }
}
// hybrid inheritance

///       base class
//  __________|_________
//  |                   |
//  derived          derived
//    class           class
//                     |
//                   derived
//                     class