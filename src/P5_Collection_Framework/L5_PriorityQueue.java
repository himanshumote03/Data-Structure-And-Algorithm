package P5_Collection_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class L5_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> c = new PriorityQueue<>();

        c.offer(40);
        c.offer(89);
        c.offer(30);
        c.offer(200);
        c.offer(400);
        System.out.println(c);

        System.out.println(c.poll());
        System.out.println(c);

        System.out.println("------------------------------");
        Queue<Integer> d = new PriorityQueue<>(Comparator.reverseOrder());

        d.offer(40);
        d.offer(89);
        d.offer(30);
        d.offer(200);
        d.offer(400);
        System.out.println(d);

        System.out.println(d.poll());
        System.out.println(d);


    }
}
