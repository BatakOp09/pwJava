package API;


enum Week{
    MON , TUE , THU , WED , FRI ,SAT ,SUN;
}

public class enum1 {
    enum result{
        pass , fail , na ;
    }
    public static void main(String[] args) {
        
        Week w = Week.TUE;
        System.out.println(w);

        result r = result.pass;
        System.out.println(r);

        Week wr[] = Week.values();
        for(Week w1 : wr){
            System.out.println(w1+":"+w1.ordinal());
        }
    }
}
