import java.util.Scanner;

public class File3 extends ExternalClass {
    public static void main(String[] args) {
        ExternalClass ec = new ExternalClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        System.out.print("Enter the power: ");
        double power = sc.nextDouble();

        int result = ec.power(number, power);
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        sc.close();
    }
}
