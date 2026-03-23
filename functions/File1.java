import java.util.Scanner;

public class File1 {
    public static void printPrimeNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.print("1st number is bigger then 2nd number...!");
            return;
        }
        for (int i = num1; i <= num2; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        return;
    }
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        printPrimeNumber(num1, num2);
        sc.close();
    }
}
