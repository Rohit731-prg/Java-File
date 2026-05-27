class A implements Runnable {

    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("This is from class A");
        }
    }
}

class B implements Runnable {

    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("This is from class B");
        }
    }
}

public class File2 {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}