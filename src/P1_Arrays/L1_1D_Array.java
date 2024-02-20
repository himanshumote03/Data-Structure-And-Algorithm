package P1_Arrays;

import java.util.Scanner;

public class L1_1D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Array Creation
        int[] a = new int[n];
        System.out.println("Enter Values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
        System.out.println("----------------------------");

        /*
        // Inserting at specific index
        int [] b = new int[n+1];
        System.out.print("Enter index of new value to be inserted: ");
        int m = sc.nextInt();

        System.out.print("Enter Value: ");
        int p = sc.nextInt();
        for (int i = 0; i < n+1; i++) {
            if (i<m) {
                b[i] = a[i];
            } else if (i==m) {
                b[i] = p;
            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.println("Elements are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"] = " + b[i]);
        }
        */

        // Deletion element in array
        int [] b = new int[n-1];
        System.out.print("Enter index of new value to be deleted: ");
        int m = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (i<m) {
                b[i] = a[i];
            } else if (i==m) {
                continue;
            } else {
                b[i-1] = a[i];
            }
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"] = " + b[i]);
        }


    }
}
