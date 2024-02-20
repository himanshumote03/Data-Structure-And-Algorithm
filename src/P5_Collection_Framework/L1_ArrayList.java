package P5_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class L1_ArrayList {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);
        System.out.println(c);

        c.remove(2);
        System.out.println(c);

        System.out.println(c.get(2));

        c.set(1, 90);    // update
        System.out.println(c);

        System.out.println(c.contains(60));

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }

        c.clear();
        System.out.println(c);


    }
}
