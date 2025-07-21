class demo{

    static void disp1(){
        System.out.println("static method display 1");
    }

    void disp2(){
        System.out.println("non-static method display 2");
    }
}


public class methods {
    
    public static void main(String[] args) {
        demo.disp1();// calling a static method using class name only

        demo d = new demo();
        d.disp2();// calling a non-static method using object name
        d.disp1();// calling a static method using object name
    }
}
