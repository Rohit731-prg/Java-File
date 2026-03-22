// F = (C × 9/5) + 32

import java.util.Scanner;

public class File4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter celcious: ");
        int cel = sc.nextInt();

        float fer = (cel * 9 / 5) + 32;
        System.out.print("\n\nFeranite: " +fer);

        sc.close();
    }
}
