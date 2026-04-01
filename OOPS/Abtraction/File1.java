abstract class Base{
    abstract void display();
}

class Derives extends Base {
    void display() {
        System.out.println("Derived class implementation of display method.");
    }
}

public class File1 {
    public static void main(String[] args) {
        Derives obj = new Derives();
        obj.display();
    }
}
