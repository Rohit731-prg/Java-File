// swap 2 number without 3nd variable and with

import java.util.Scanner;

public class File3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        // with 3nd variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.print("\n\n1st number: " +num1);
        System.out.print("\n2st number: " +num2);

        // without 3rd variable

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.print("\n\n1st number: " +num1);
        System.out.print("\n2st number: " +num2);

        sc.close();
    }
}
