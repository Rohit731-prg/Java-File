// diagonal sum of a matrix

import java.util.Scanner;

class Matrix {
    int sum;
    int [][]arr;
    Matrix(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        this.arr = new int[row][column];

        this.arr = arr;
    }

    int diagonal_sum() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                if (i == j) {
                    this.sum += arr[i][j];
                }
            }
        }

        return this.sum;
    }
}

public class File6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Column: ");
        int column = sc.nextInt();

        int [][]arr = new int[row][column];
        System.out.println("Enter Data: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Matrix mx = new Matrix(arr);
        int sum = mx.diagonal_sum();

        System.out.println("\nOriginal Array: ");
        for (int[] rows: arr) {
            for (int ele: rows) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    
        System.out.print("\nAddition of diagonal sum of a elements: " + sum);

        sc.close();
    }
}
