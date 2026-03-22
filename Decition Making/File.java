import java.util.Scanner;

public class File {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print(num + "is a Even Number.");
        } else {
            System.out.print(num + "is a Odd Number.");
        }

        sc.close();
    }
}