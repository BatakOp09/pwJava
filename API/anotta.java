package API;

import java.util.*;
import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface cricketplayer{

    String country() default "india";

    int age() default 34;
}




@cricketplayer
class virat{

    @cricketplayer
    private int runs;

    @cricketplayer
    void setRuns(int runs){
        this.runs = runs;
    }
    int getRuns(){
        return runs;
    }
}

public class anotta {
    public static void main(String[] args) {
        
        virat v = new virat();
        v.setRuns(239);
        System.out.println(" ");
        System.out.println(v.getRuns());
        Class c =v.getClass();

        Annotation a = c.getAnnotation(cricketplayer.class);
        cricketplayer cp = (cricketplayer)a;

        String country =cp.country();
        System.out.println(country);

        int age = cp.age();
        System.out.println(age);

    }
}
