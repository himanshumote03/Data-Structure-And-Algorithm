package P5_Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class L8_TreeSet {
    public static void main(String[] args) {
        Set<Integer> c = new TreeSet<>();
        c.add(120);
        c.add(10);
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);
        System.out.println(c);

        System.out.println(c.size());

        System.out.println(c.contains(60));
        System.out.println(c.contains(70));

        c.remove(50);
        System.out.println(c);

        c.clear();
        System.out.println(c);

        Set<Character> ch = new TreeSet<>();
        ch.add('I');
        ch.add('E');
        ch.add('A');
        ch.add('U');
        ch.add('O');

        System.out.println(ch);
    }
}
