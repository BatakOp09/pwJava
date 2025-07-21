package collectionAPI;

import java.util.*;

public class collection1 {
    public static void main(String[] args) {
        
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.print(al1);

        ArrayList al2 = new ArrayList();
        al2.add("pw skills");
        al2.add(1.1);
        al2.add('j');
        al2.add(1);
        //System.out.println(al2);

        //al1.addAll(al2);
        //System.out.println(al1);

        //al1.add(2,400);
        //System.out.println(al1);
            
        /*for(int i=0;i<al1.size();i++){
                Object o=al1.get(i);
                System.out.println(o);
            }*/
            
            for(Object o:al1){
                System.out.println(o);
            }

            //System.out.print("-------------------------------------");

            Iterator itr = al1.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }


            ListIterator litr = al1.listIterator(al1.size());
            while(litr.hasPrevious()){
                System.out.println(litr.previous());
            }
    }
}
