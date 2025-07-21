package collectionAPI;

import java.util.PriorityQueue;

public class collection3 {
    public static void main(String[] args){

        PriorityQueue pq = new PriorityQueue();
        //index based insetion is not allowed

        pq.add(100);
        pq.add(200);
        pq.add(30);
        pq.add(1);
        pq.add(8);
        pq.add(90);
        pq.add(309);
        pq.add(30);

        System.out.println(pq);
    }
}
