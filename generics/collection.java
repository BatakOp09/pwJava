package generics;

import java.util.*;

public class collection {
    public static void main(String args[]){

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(60);
        al.add(50);
        al.add(20);

        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        List<String> a = new ArrayList<String>();

        a.add("pw");
        a.add("sangram");
        a.add("ananyo");
        a.add("hello");

        Collections.sort(a);
        System.out.println(a);

        int index = Collections.binarySearch(al,20);
        System.out.println(index);

        Collections.rotate(al,3);
        System.out.println(al);

        
        System.out.println(Collections.frequency(al,20));
    }

}
