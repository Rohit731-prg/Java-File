import java.util.Scanner;

public class File3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("\n\n");
        String[] opers = {"+", "-", "*", "/", "Exit"};
        int i = 1;
        for (String oper: opers) {
            System.out.print("\nEnter " +i+ " for " + oper);
            i++;
        }
        System.out.print("\n\nEnter Your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("\nAddition : " + (num1 + num2));
                break;
            
            case 2:
                System.out.print("\nSubtraction : " + (num1 - num2));
                break;

            case 3:
                System.out.print("\nMultiplication : " + (num1 * num2));
                break;

            case 4:
                System.out.print("\nDivition : " + (num1 / num2));
                break;

            case 5:
                System.out.print("\nExit from calculator");
                break;

            default:
                System.out.println("Enter a valid choice...!");
                break;
        }

        sc.close();
    }
}
