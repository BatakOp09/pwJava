package collectionAPI;

import java.util.*;

public class collection2 {
    public static void main(String[] args) {
        ArrayDeque al1 = new ArrayDeque();

        al1.add(100);
        al1.add(200);
        al1.addFirst(10);
        al1.addLast(20);
        al1.offer("pw");
        System.out.println(al1);

        al1.offer(80);
        System.out.println(al1); //index based insertion is not allowed
    }
}


