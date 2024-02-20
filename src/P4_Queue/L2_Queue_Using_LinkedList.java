package P4_Queue;

import java.util.Scanner;

class queueLL {
    static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;  // head
    Node rear = null;   // tail

    void enqueue(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (front == null) {
            front = new_node;
            rear = front;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }
    }

    void dequeue() {
        if (front==null) {
            System.out.println("Underflow");
        }
        else if (front==rear) {
            System.out.println("Empty");
        }
        else {
            front = front.next;
            display();
        }
    }

    void display() {
        Node temp = front;
        System.out.print("Queue Contain: ");
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" ");
    }
}

public class L2_Queue_Using_LinkedList {

    public static void main(String[] args) {
        queueLL ll = new queueLL();
        Scanner sc = new Scanner(System.in);

        int d, l;
        do {
            System.out.println("Press 1 to enqueue()");
            System.out.println("Press 2 to dequeue ()");
            System.out.println("Press 3 to display()");
            System.out.print("Enter your choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1 -> ll.enqueue(sc);
                case 2 -> ll.dequeue();
                case 3 -> ll.display();
            }
            System.out.println("Enter 0 to go back to main menu");
            System.out.println("Enter any key to exit");
            System.out.print("Choice: ");
            l = sc.nextInt();
        } while (l==0);
        System.out.println("Exit");
    }
}
