// transpose a matrix

import java.util.Scanner;

public class File4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Limit: ");
        int row = sc.nextInt();
        System.out.print("Enter Column Limit: ");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        int trans[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter data: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array");
        for (int[] i: arr) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // transopse the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                trans[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose Array");
        for (int[] i: trans) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
