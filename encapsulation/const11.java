class demo{
    private int a;
    private int b;

    demo(int a, int b){
        this.a =a;
        this.b=b;

    }

    demo(){
        System.out.print("zero parameterized constructor by the programmer himself");
    }



    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class const11 {
    public static void main(String[] args) {
        demo d = new demo(10,20);
        d.display();

        demo d2 = new demo();
        d2.display();
    }
}
