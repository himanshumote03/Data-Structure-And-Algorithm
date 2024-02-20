package P5_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class L9_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> c = new HashMap<>(); // key, value
        c.put(1,"A");
        c.put(2,"B");
        c.put(3,"C");
        c.put(3,"D");
        c.put(10,"Himanshu");
        System.out.println(c);

        c.putIfAbsent(4,"C");
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
        System.out.println(c);

    }
}
