package P10_SortingAlgorithm;

import java.util.Scanner;

public class L2_Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do u want: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        int ptr, temp, loc;

        System.out.println("Enter Elements");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value [" + (i+1) + "]: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            loc = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[loc]) {
                    loc = j;
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
