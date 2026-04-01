class Base {
    void display() {
        System.out.println("Base class");
    }
}

class Child extends Base {}

public class File4 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
