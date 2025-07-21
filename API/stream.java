package API;

import java.util.Arrays;
import java.util.List;

import java.util.stream.*;

public class stream {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,4,6,2,8,9,10);
        //System.out.println(list);

        // Stream<Integer> streamData = list.stream();

        // Stream<Integer> filterData = streamData.filter(n->n%2==0);

        // Stream<Integer> sortedData = filterData.sorted();

        // Stream<Integer> mapStream = sortedData.map(n->n*2);

        // mapStream.forEach(n->System.out.println(n));  
        
        // sortedData.forEach(n->System.out.println(n););

        // long c = streamData.count();
        // System.out.println(c);

        //streamData.forEach(n->System.out.println(n));

        Stream<Integer> data = list.stream();


        Stream<Integer> finalData = data.filter(n->n%2==0).sorted().map(n->n*2);

        finalData.forEach(n->System.out.println(n));


    }
    
}
