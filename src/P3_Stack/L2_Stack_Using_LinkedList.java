package P3_Stack;

import java.util.Scanner;

class Stack {
    static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node top = null;   // head

        void push(Scanner sc) {
            System.out.print("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (top == null) {
                top = new_node;
            }
            else {
                new_node.next = top;
                top = new_node;
            }
        }

        void pop() {
            if (top==null) {
                System.out.println("Stack is empty");
            }
            else {
                top = top.next;
                display();
            }
        }

        void display() {
            Node temp = top;
            System.out.print("Stack Contain: ");
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(" ");
        }
}




public class L2_Stack_Using_LinkedList {


    public static void main(String[] args) {
        Stack ll = new Stack();
        Scanner sc = new Scanner(System.in);

        int d, l;
        do {
            System.out.println("Press 1 to push()");
            System.out.println("Press 2 to pop()");
            System.out.println("Press 3 to display()");
            System.out.print("Enter your choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1 -> ll.push(sc);
                case 2 -> ll.pop();
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