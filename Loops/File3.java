import java.util.Random;;

public class File3 {
    public static void main(String[] arg) {
        Random rd = new Random();

        int num = rd.nextInt(1111, 9999);
        System.out.print("Original Number: " + num);

        int temp = num;
        int sum = 0;
        while (num != 0) {
            int reminder = num % 10;
            sum = reminder + (sum * 10);
            num /= 10;
        }
        System.out.println("\n\nReversed number : " + sum);
        if (temp == num) {
            System.out.print("\n\n" + temp + " is palindrom number...");
        } else {
            System.out.print("\n\n" + temp + " is not a palindrom number...");
        }
    }
}
