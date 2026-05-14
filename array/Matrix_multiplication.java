import java.util.Random;
import java.util.Scanner;

class Matrix {
    int[][] arr1;
    int[][] arr2;

    Matrix(int row, int col) {
        Random rd = new Random();
        arr1 = new int[row][col];
        arr2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int random1 = rd.nextInt(11, 99);
                int random2 = rd.nextInt(11, 99);
                arr1[i][j] = random1;
                arr2[i][j] = random2;
            }
        }

        System.out.println("\nOriginal 1st Array");
        for (int[] i : this.arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\nOriginal 2nd Array");
        for (int[] i : this.arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void multiply() {
        int n = this.arr1[0].length;

        int new_arr[][] = new int[this.arr1.length][this.arr2[0].length];

        for (int i = 0; i < this.arr1.length; i++) {
            for (int j = 0; j < this.arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += this.arr1[i][k] * this.arr2[k][j];
                }
                new_arr[i][j] = sum;
            }
        }

        System.out.println("\nResult Matrix:");
        for (int[] i : new_arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Limit");
        int row = sc.nextInt();
        System.out.print("Enter column Limit");
        int col = sc.nextInt();

        Matrix mt = new Matrix(row, col);
        System.out.println("Multiplication of 2 array: ");
        mt.multiply();
        sc.close();
    }
}
