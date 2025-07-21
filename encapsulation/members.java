class demo{
    static int a;
    static int b;

    int m;
    int n; 

{
    System.out.println("inside the non static block");
    m=30;
    n=40;
}

    static{
        System.out.println("inside the static block");
        a=10;
        b=20;
    }

    static void disp1(){
        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);
    }

    void disp2(){
        System.out.println("the value of non-static members are :"+ m +" and "+ n);
    }

    
}

public class members {

    public static void main(String[] args) {
        demo d1 = new demo();
        //demo d2 = new demo();
        System.out.println(demo.a);
        demo.disp1();
        d1.disp2();
    }
   
}
