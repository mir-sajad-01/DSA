public class _72_copyconstructor {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.name = " sajad";
        s1.roll = 33;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        student1 s2 = new student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class student1 {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    /*
     * student1(student1 s1) {//The constructor student1(student1 s1) is known as a
     * copy constructor. A copy constructor is a special type of constructor that
     * takes an object of the same class as a parameter and creates a new object by
     * copying the values from the existing object. In the provided code, this copy
     * constructor is used to create a new student1 object (s2) based on an existing
     * one (s1).
     * marks = new int[3];
     * this.name = s1.name;
     * this.roll = s1.roll;
     * this.marks = s1.marks; // copy reference only
     * }
     */
    // Deep copy constructor
    student1(student1 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i]; // copy value one by one
        }
    }

    student1() {
        marks = new int[3];
        System.out.println("constructor is called");
    }

    student1(String name) {
        marks = new int[3];
        this.name = name;
    }

    student1(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
// _72_copyconstructor
// |
// |-- main(String[] args)
// | |
// | |-- student1 s1 = new student1();
// | | |
// | | |-- student1() (Default constructor)
// | | |
// | | |-- marks = new int[3];
// | | |-- System.out.println("constructor is called");
// | |
// | |-- s1.name = " sajad";
// | |-- s1.roll = 33;
// | |-- s1.password = "abcd";
// | |-- s1.marks[0] = 100;
// | |-- s1.marks[1] = 90;
// | |-- s1.marks[2] = 80;
// |
// |-- student1 s2 = new student1(s1);
// | |
// | |-- student1(student1 s1) (Copy constructor)
// | |
// | |-- marks = new int[3];
// | |-- this.name = s1.name;
// | |-- this.roll = s1.roll;
// | |-- this.marks = s1.marks; (Shares the array reference with s1)
// |
// |-- s2.password = "xyz";
// |-- s1.marks[2] = 100;
// |
// |-- for (int i = 0; i < 3; i++)
// | |
// | |-- System.out.println(s2.marks[i]);
// |
// |-- class student1
// | |
// | |-- String name;
// | |-- int roll;
// | |-- String password;
// | |-- int marks[];
// | |
// | |-- student1(student1 s1)
// | |-- student1()
// | |-- student1(String name)
// | |-- student1(int roll)
