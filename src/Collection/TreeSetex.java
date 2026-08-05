package Collection;

import java.util.TreeSet;

public class TreeSetex {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(60);
        ts.add(70);

        System.out.println(ts);

        System.out.println(ts.first());

        System.out.println(ts.last());

        System.out.println(ts.higher(30));

        System.out.println(ts.lower(30));

    }
}