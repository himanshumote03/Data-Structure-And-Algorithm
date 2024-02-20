package P3_Stack;

import java.util.Scanner;

public class L1_Stack_Using_Array {

    int n = 10;
    int top = -1;
    int []a = new int[n];
    void push() {
        Scanner sc = new Scanner(System.in);
        if (top==(n-1)) {
            System.out.println("Overflow");
        }
        else {
            System.out.print("Enter data: ");
            int i = sc.nextInt();
            top=top+1;
            a[top] = i;
            System.out.println("Item Inserted");
        }
    }
    void pop() {
        if (top==-1) {
            System.out.println("Underflow");
        }
        else {
            top=top-1;
            System.out.println("Item Deleted");
        }
    }
    void display() {
        System.out.print("Items are: ");
        for (int i=top; i>=0 ; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        L1_Stack_Using_Array s = new L1_Stack_Using_Array();
        Scanner sc = new Scanner(System.in);

        int d, l;
        do {
            System.out.println("Press 1 to push()");
            System.out.println("Press 2 to pop()");
            System.out.println("Press 3 to display()");
            System.out.print("Enter your choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1 -> s.push();
                case 2 -> s.pop();
                case 3 -> s.display();
            }

/*
            switch (d) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }
*/
            System.out.println("Enter 0 to go back to main menu");
            System.out.println("Enter any key to exit");
            System.out.print("Choice: ");
            l = sc.nextInt();
        } while (l==0);
        System.out.println("Exit");
    }
}
