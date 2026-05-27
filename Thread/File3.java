class A implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Calling class A");
        }
    }
}

public class File3 {
    public static void main(String[] args) throws Exception {
        A a = new A();
        Thread new_t = new Thread(a);
        new_t.start();
        new_t.join();
        System.out.println("Finish");
    }
}
