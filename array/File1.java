// sorting an array

import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Limit: ");
        int limit = sc.nextInt();
        int[] numbers = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // sorting the array

        for (int i = 0; i < limit - 1; i++) {
            for (int j = 0; j < limit - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array: ");
        for (int i: numbers) {
            System.out.println(i);
        }

        sc.close();
    }
}
