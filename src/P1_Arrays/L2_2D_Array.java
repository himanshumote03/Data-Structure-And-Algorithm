package P1_Arrays;

import java.util.Scanner;

public class L2_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no of column: ");
        int c = sc.nextInt();

        int [][] a = new int[r][c];
        System.out.println("Enter Values: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("a["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements are: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int[][] b = {{1,2}, {3,4}, {5,6}};
        System.out.println("Elements are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
