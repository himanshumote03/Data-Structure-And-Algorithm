package P5_Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class L4_Queue {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<>();

        c.offer(10);
        c.offer(20);
        c.offer(30);
        c.offer(60);
        c.offer(100);
        System.out.println(c);

        System.out.println(c.peek());
        c.poll(); // dequeue from front
        System.out.println(c);


    }
}
