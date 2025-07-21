package collectionAPI;

import java.util.*;

public class collection4 {
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(25);
        ts.add(50);
        ts.add(125);
        ts.add(150);
        ts.add(200);
        ts.add(175);
        ts.add(225);

        ts.add(50);// duplicate elements not allowed

        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));

        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
}
}
