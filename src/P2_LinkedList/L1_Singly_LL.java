package P2_LinkedList;
import java.util.Scanner;

public class L1_Singly_LL {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            }
            else {
                System.out.print("1 - Insert at beginning \n2 - Insert at end \n3 - Insert at specific position \nEnter Choice: ");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        new_node.next = head;
                        head = new_node;
                    }
                    case 2 -> {
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
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
                    }
                }
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
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
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
                        System.out.println("----------------------");
                        traverse();
                        System.out.println("----------------------");
                        break;
                    }
                    case 2 -> {
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next!=null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
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
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        L1_Singly_LL ll = new L1_Singly_LL();
        ll.creation();
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

//        System.out.println("----------------------");
//        ll.traverse();
//        System.out.println("----------------------");
//        ll.deletion();
//        System.out.println("----------------------");
//        ll.traverse();
//        System.out.println("----------------------");



    }
}