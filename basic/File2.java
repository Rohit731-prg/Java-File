import java.util.Scanner;

public class File2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num2 - num1;
        int mul = num1 * num2;
        int div = num2 / num1;

        System.out.print("\n\nAddition : " + add);
        System.out.print("\nSubtration : " + sub);
        System.out.print("\nMultiplication : " + mul);
        System.out.print("\nDivition : " + div);

        sc.close();
    }
}
