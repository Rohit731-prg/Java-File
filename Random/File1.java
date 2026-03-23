import java.util.Random;

public class File1 {
    public static void main(String[] arg) {
        Random rd = new Random();

        int random = rd.nextInt(1111, 9999);
        System.out.println(random);
    }
}
