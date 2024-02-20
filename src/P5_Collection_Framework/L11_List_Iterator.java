package P5_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class L11_List_Iterator {
    public static void main(String[] args) {

        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);

        ListIterator<Integer> d = c.listIterator();
        while (d.hasNext()) {
            System.out.print(d.next()+" ");
        }
        System.out.println();
        while (d.hasPrevious()) {
            System.out.print(d.previous()+" ");
        }
    }
}
