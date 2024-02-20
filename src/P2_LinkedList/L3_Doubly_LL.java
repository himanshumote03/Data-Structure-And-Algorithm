package P2_LinkedList;

import java.util.Scanner;

public class L3_Doubly_LL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            }
            else {
                System.out.print("1 - Insert at beginning \n2 - Insert at end \n3 - Insert at specific position \nEnter Choice: ");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        head.prev = new_node;
                        new_node.next = head;
                        head = new_node;
                    }
                    case 2 -> {
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                    }
                    case 3 -> {
                        System.out.print("Enter position: ");
                        p = sc.nextInt();
                        Node temp = head;
                        Node ptr = head.next;
                        for (int i = 0; i < (p - 2); i++) {
                            temp = temp.next;
                            ptr = ptr.next;
                        }
                        new_node.prev = temp;
                        new_node.next = ptr;
                        temp.next = new_node;
                        ptr.prev = new_node;
                    }
                }
            }
            System.out.print("Do you want to add more data. \nIf Yes, press 1:");
            n = sc.nextInt();
        } while (n==1);
    }
    public void deletion() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("Linked List is Empty");
            }
            else {
                System.out.print("\n1 - Delete at beginning \n2 - Delete at end \n3 - Delete at specific position \nEnter Choice: ");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = null;
                        System.out.println("----------------------");
                        traverse();
                        System.out.println("----------------------");
                        break;
                    }
                    case 2 -> {
                        Node temp1 = tail;
                        temp1 = temp1.prev;
                        temp1.next = null;
                        tail = temp1;
                        System.out.println("----------------------");
                        traverse();
                        System.out.println("----------------------");
                        break;
                    }
                    case 3 -> {
                        System.out.print("Enter position of node to be deleted: ");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < (p-2); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        ptr1.next.prev = temp2;
                        System.out.println("----------------------");
                        traverse();
                        System.out.println("----------------------");
                        break;
                    }
                }
            }
            System.out.print("\nDo you want to delete more data. \nIf Yes, press 1:");
            n = sc.nextInt();
        } while (n==1);
    }

    public void traverse() {
        Node temp = head;
        if (head==null) {
            System.out.print("Linked List does not exist");
        }
        else {
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        L3_Doubly_LL ll = new L3_Doubly_LL();
        ll.creation();
        ll.traverse();
        ll.deletion();
    }

}
