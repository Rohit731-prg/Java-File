import java.util.Random;

class RandomNumber {
    static void display(int num) {
        System.out.println(num);
    }
}

public class File1 {
    public static void main(String[] arg) {
        Random rd = new Random();

        int num = rd.nextInt(111, 999);
        RandomNumber.display(num);
        num = rd.nextInt(111, 999);
        RandomNumber.display(num);
        num = rd.nextInt(111, 999);
        RandomNumber.display(num);
    }
}
