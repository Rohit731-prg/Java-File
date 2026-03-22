import java.util.*;

public class File2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int reminder = num % 10;
            sum = reminder + (sum * 10);
            num /= 10;
        }

        System.out.println("\nReverce Number: " + sum);
        sc.close();
    }
}
