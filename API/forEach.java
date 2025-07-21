package API;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class forEach {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,4,5,8,6,7,9);
        System.out.println(list1);


        for(Integer i : list1){
            System.out.println(i);
        }

        list1.forEach(n->System.out.print(n));

        // Consumer<Integer> cons = new Consumer<Integer>(){
        //     @Override
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }
        // };

        // list1.forEach(cons);
    }

}
