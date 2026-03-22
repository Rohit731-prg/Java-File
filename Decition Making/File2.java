import java.util.*;

public class File2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("\n\nLargest Number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("\n\nLargest Number: " + num2);
        } else {
            System.out.print("\n\nLargest Number: " + num3);
        }
        sc.close();
    }
}
