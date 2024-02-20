package P4_Queue;

import java.util.Scanner;

class queue{
    int n = 10;
    int f = -1, r = -1;
    int []q = new int[n];
    void enqueue(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        if (r==(n-1)) {
            System.out.println("Overflow");
        }
        else {
            if (f==-1 && r==-1) {
                f = 0;
                r = 0;
                q[r] = data;
            }
            else {
                r++;
                q[r] = data;
            }
        }
    }
    void dequeue() {
        if (f==-1 && r==-1) {
            System.out.println("Underflow");
        } else if (f==r) {
            System.out.println("Empty");
        }
        else {
            f++;
        }

    }
    void display() {
        System.out.print("Items are: ");
        for (int i=f; i<=r; i++) {
            System.out.print(q[i]+" ");
        }
        System.out.println("\n");
    }
}

public class L1_Queue_Using_Array {
    public static void main(String[] args) {
        queue q = new queue();
        Scanner sc = new Scanner(System.in);

        int d, l;
        do {
            System.out.println("Press 1 to enqueue()");
            System.out.println("Press 2 to dequeue()");
            System.out.println("Press 3 to display()");
            System.out.print("Enter your choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1 -> q.enqueue(sc);
                case 2 -> q.dequeue();
                case 3 -> q.display();
            }

            System.out.println("Enter 0 to go back to main menu");
            System.out.println("Enter any key to exit");
            System.out.print("Choice: ");
            l = sc.nextInt();
        } while (l==0);
        System.out.println("Exit");
    }
}

