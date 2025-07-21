
class demo1
{
    int m,n;
    public demo1(){
        System.out.println("parent class constructor with zero parameters");
    }
    public demo1(int x,int y){
        this();
        System.out.println("parent class constructor with parameters");
        m=x;
        n=y;
        System.out.println("the sum is "+(m+n));
    }
}

class demo2 extends demo1{
    int m,n;
    public demo2(){
        //by default super() method is called by JVM
        //super(10,20);
        //this(5, 5);
        super(10,5);
        System.out.println("child class constructor with zero parameters");
    }
    public demo2(int x,int y){
        //this();
        System.out.println("child class constructor with parameters");
        m=x;
        n=y;
        System.out.println("the sum is: "+(m+n));
    }

    }


public class execution {
    public static void main(String[] args) {
        //demo2 d = new demo2(10,20);
        demo2 d1 = new demo2();
    }
}
