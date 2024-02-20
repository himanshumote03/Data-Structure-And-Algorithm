package P9_SearchingAlgorithm;

import java.util.Scanner;

public class L1_LinearSearch {

    public static void linearSearch(int [] a, int k) {
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==k) {
                System.out.println("Item exist at location "+(i+1));
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Item not exist");
        }
    }

    public static void main(String[] args) {
        int n, item;
        int [] a;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element ["+ (i+1)+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter item to find: ");
        item = sc.nextInt();

        linearSearch(a, item);
    }
}
