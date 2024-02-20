package P5_Collection_Framework;

import java.util.Scanner;
import java.util.Stack;

public class L2_Stack {
    public static void main(String[] args) {
        Stack<Integer> c = new Stack<>();

        c.push(100);
        c.push(200);
        c.push(300);
        c.push(400);
        System.out.println(c);

        System.out.println("peek(): "+c.peek());

        System.out.println("pop(): "+c.pop());
        System.out.println(c);

        System.out.println("position of 300: "+c.search(300));

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            int val = sc.nextInt();
            c.add(val);
        }
        System.out.println(c);

        if (! c.isEmpty()) {
            System.out.println("pop(): "+c.pop());
        }

    }
}
