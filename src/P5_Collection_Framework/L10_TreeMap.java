package P5_Collection_Framework;

import java.util.Map;
import java.util.TreeMap;

public class L10_TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> c = new TreeMap<>();
        c.put(1,"A");
        c.put(2,"B");
        c.put(4,"C");
        c.put(3,"D");
        c.put(3,"E");
        c.put(10,"H");
        System.out.println(c);

        c.putIfAbsent(3,"F");
        c.putIfAbsent(7,"F");
        System.out.println(c);

        System.out.println(c.isEmpty());
        System.out.println(c.remove(3));
        System.out.println(c);

        for (Integer i : c.keySet()) {
            System.out.println(i);
        }
        for (String s : c.values()) {
            System.out.println(s);
        }
        c.put(4,"S");
        System.out.println(c);
    }
}
