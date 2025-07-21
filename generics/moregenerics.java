package generics; 

import java.util.*;

class gen<T>{

    T obj; 

    public gen(T obj){
        this.obj = obj;
    }

    public T getobj(){
        return obj;
    }

    public void disp(){
        System.out.println(" the object returned is type :  "+ obj.getClass().getName());
    }
}

public class moregenerics {
    public static void main(String[] args) {

        gen <Integer> g = new gen <Integer>(10);

        g.disp();
        System.out.println(g.getobj());
        


    }
}
