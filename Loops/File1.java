import java.util.Scanner;

public class File1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Table number: ");
        int num = sc.nextInt();
        System.out.print("Enter Limit: ");
        int limit = sc.nextInt();

        for (int i = 1; i < limit; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
