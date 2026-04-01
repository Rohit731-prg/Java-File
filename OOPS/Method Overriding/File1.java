class Base {
    int num;
    Base (int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }

    void display() {
        System.err.println("Base class: " + num);
    }
}

class Derived extends Base {
    int num, num2;
    Derived(int num, int num2) {
        super(num);
        this.num2 = num2;
    }

    void display() { // this display method overrides the display method of the base class
        System.out.println("Base class: " + getNum());
        System.err.println("Derived class: " + num2);
    }
}

public class File1 {
    public static void main(String[] args) {
        Derived d = new Derived(10, 20);
        d.display();
    }
}
