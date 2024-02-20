package P10_SortingAlgorithm;

import java.util.Scanner;

public class L1_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Data " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
