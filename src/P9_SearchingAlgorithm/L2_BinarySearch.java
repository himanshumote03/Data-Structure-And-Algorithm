package P9_SearchingAlgorithm;

import java.util.Scanner;

public class L2_BinarySearch {
    public static void binarySearch(int [] a, int k) {
        boolean flag = true;
        int beg, end, mid;
        beg = 0;
        end = a.length-1;
        while (beg <= end) {
            mid = (beg+end) / 2;
            if (k == a[mid]) {
                System.out.println("Item found at location " + (mid+1));
                flag = false;
                break;
            }
            else if (k > a[mid]) {
                beg = mid+1;
            }
            else if (k < a[mid]) {
                end = mid-1;
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

        binarySearch(a, item);



    }
}
