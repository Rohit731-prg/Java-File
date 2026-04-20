// print only prime numbers from matrix

import java.util.Scanner;

public class File5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter columns: ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter data: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.err.println("Original Matrix");
        for (int[] i: arr) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Print only prime elements");
        int count;
        for (int[] i: arr) {
            for (int j: i) {
                count = 0;
                for (int ele = 1; ele <= j; ele++) {
                    if (j % ele == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(j);
                }
            }
        }

        sc.close();
    }
}
