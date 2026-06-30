import java.io.IOException;

class myThread extends Thread {
    int num = 0;

    public void run() {
        for (int i = 0; i < 20; i++) {
            num += 10;
        }
    }

    void display() {
        System.out.println(num);
    }
}

public class Race_Condition {
    public static void main(String[] args) throws IOException {
        myThread t1 = new myThread();
        myThread t2 = new myThread();

        t1.start();
        t2.start();

        try {
        t1.join();
        t2.join();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        t1.display();
        t2.display();
    }
}
