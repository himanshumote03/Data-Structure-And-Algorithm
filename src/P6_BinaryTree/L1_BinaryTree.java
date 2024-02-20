package P6_BinaryTree;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        left=null;
        right=null;
    }
}

public class L1_BinaryTree {
    static Node create() {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.print(" Enter data: ");
        int data = sc.nextInt();
        if (data==-1) {
            return null;
        }

        root = new Node(data);
        System.out.print("Enter left child of: "+ root.data);
        root.left = create();
        System.out.print("Enter right child of: "+ root.data);
        root.right = create();

        return root;
    }

    static void inorder(Node root) {    // Left - Root - Right
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" - ");
        inorder(root.right);
    }

    static void preorder(Node root){    // Root - Left - Right
        if (root==null) {
            return;
        }
        System.out.print(root.data+" - ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {   // Left - Right - Root
        if (root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" - ");
    }

    public static void main(String[] args) {
        Node root = create();
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(root);
    }
}