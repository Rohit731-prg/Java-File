class Test {
    int num;
    Test(int num) {
        this.num = num;
    }
    void display() {
        System.out.println("Display Test class method: " + this.num);
    }
}

public class File3 {
    static {
        Test t = new Test(50);
        t.display();
    }

    public static void main(String[] args) {
        Test t = new Test(500);
        t.display();
    }
}
