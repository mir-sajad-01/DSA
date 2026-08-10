public class _70_constructors {
    public static void main(String[] args) {
      //  student p1 = new student(); // non parameterized
        student p1 = new student("shraddha");  // parameterized
        System.out.println(p1.name);
    }
}
class student{
    // student (){
    //     System.out.println("i am constructor");
    // }
    String name;
    student(String name){
      this.name = name;
    }
}
