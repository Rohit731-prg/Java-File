// set operation on 1d array

import java.util.Scanner;

class Set {
    void union(int[] arr1, int[] arr2) {
        int new_arr[] = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            new_arr[i] = arr1[i];
            k++;
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr2[i] == new_arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                new_arr[k] = arr2[i];
                k++;
            }
        }

        System.out.println("Union of 2 arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }

    void intersection(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int new_arr[] = new int[len];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    new_arr[k] = arr1[i];
                    k++;
                }
            }
        }
        System.out.println("Intersection of 2 arrays: ");
        for (int i = 0; i < new_arr.length - 1; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }

    void cartition_product(int[] arr1, int[] arr2) {
        int len = arr1.length * arr2.length;
        int new_arr[][] = new int[len][2];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                new_arr[k][0] = arr1[i];
                new_arr[k][1] = arr2[j];
                k++;
            }
        }

        for (int[] element : new_arr) {
            for (int el : element) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}

public class Set_Operation {
    public static void main(String[] args) {
        Set set = new Set();

        System.out.print("Enter your limit: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int arr1[] = new int[limit];
        int arr2[] = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.print("Enter Data for 1st array: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter Data for 2nd array: ");
            arr2[i] = sc.nextInt();
        }
        String choice_array[] = { "1. Union", "2. Intersection", "3. Cartition Product" };
        for (String ch : choice_array) {
            System.out.println(ch);
        }
        System.out.print("Enter you choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                set.union(arr1, arr2);
                break;
            case 2:
                set.intersection(arr1, arr2);
                break;
            case 3:
                set.cartition_product(arr1, arr2);
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
        sc.close();
    }
}
