


class demo1{
    void sleep(){
        System.out.println("i am sleeping");
    }
}
class demo2 extends demo1{
    void eat(){
        System.out.println("i am eating");
    }
}
class demo3 extends demo2{
    void display(){
        System.out.println("good night");
    }
}
public class multilevel {
    public static void main(String[] args) {
        demo3 d = new demo3();
        d.sleep();
        d.eat();

        demo2 d1 = new demo2();
        //d1.display();
    }
}
