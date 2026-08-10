public class _69_setget {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setname("sajad");
        System.out.println(p1.getname());
        p1.setage(33);
        System.out.println(p1.getage());
    }
}
class Pen1 {
    String name;
    int age;
    void setname(String newname) {
        this.name = newname;
    }
    void setage(int newage) {
        this.age = newage;
    }
    String getname() {
        return this.name;
    }
    int getage() {
        return this.age;
    }
}
