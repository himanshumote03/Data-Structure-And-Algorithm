package P5_Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class L7_LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);
        c.add(60);
        System.out.println(c);

        System.out.println(c.size());

        System.out.println(c.contains(60));
        System.out.println(c.contains(70));

        c.remove(50);
        System.out.println(c);

        c.clear();
        System.out.println(c);
    }
}
