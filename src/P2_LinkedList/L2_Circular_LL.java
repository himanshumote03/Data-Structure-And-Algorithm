package P2_LinkedList;

import java.util.Scanner;

public class L2_Circular_LL {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
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
                new_node.next = head;
            }
            else {
                System.out.print("1 - Insert at beginning \n2 - Insert at end \n3 - Insert at specific position \nEnter Choice: ");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;
                    }
                    case 2 -> {
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;
                    }
                    case 3 -> {
                        System.out.print("Enter position: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 2); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                    }
                }
//                new_node.next = head;
//                head = new_node;
//                tail.next = head;
            }
            System.out.print("Do you want to add more data. \nIf Yes, press 1:");
            n = sc.nextInt();
        } while (n==1);
    }
    public void traverse() {
        Node temp = head;
        if (head==null) {
            System.out.print("Linked List does not exist");
        }
        else {
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            } while (temp!=head);
            System.out.println();
        }
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
                        tail.next = head;
                        System.out.println("----------------------");
                        traverse();
                        System.out.println("----------------------");
                        break;
                    }
                    case 2 -> {
                        Node temp = head;
                        Node ptr = temp.next;
                        while (ptr.next!=head) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        temp.next = head;
                        tail = temp;
                        System.out.println("----------------------");
                        traverse();
                        System.out.println("----------------------");
                        break;
                    }
                    case 3 -> {
                        System.out.print("Enter position of node to be deleted: ");
                        p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 0; i < (p-2); i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        temp.next = ptr.next;
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
    public boolean searchList(int key) {
        Node temp = head;
        do {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }while (temp != head);
        return false;
    }


    public static void main(String[] args) {
        L2_Circular_LL ll = new L2_Circular_LL();
        ll.creation();

//        ll.creation();

        System.out.println("----------------------");
        ll.traverse();

        System.out.println("----------------------");
        ll.deletion();

        int p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\n1- Insert \n2 - Traverse \n3 - Delete \n4 - Search \nEnter Choice: ");
            int m = sc.nextInt();
            switch (m) {
                case 1 -> {
                    ll.creation();
                }
                case 2 -> {
                    System.out.println("----------------------");
                    ll.traverse();
                    System.out.println("----------------------");
                }
                case 3 -> {
                    ll.deletion();
                }
                case 4 -> {
                    System.out.print("Enter data to search: ");
                    int key = sc.nextInt();
                    boolean n = ll.searchList(key);
                    if (n) {
                        System.out.println("Element is found");
                    } else {
                        System.out.println("Element is not found");
                    }
                }
            }
            System.out.print("Enter 1 to continue: ");
            p = sc.nextInt();
        }while (p==1);




    }
}
