interface computer{
    void show();
    default void config(){
        System.out.println("code is running");
    }
    static void abc(){
        System.out.println("inside the code editor");
    }

}

class desktop implements computer{
    public void show(){
        System.out.println("5 errors occured");
    }
}

public class java8 {
    public static void main(String[] args) {
        computer.abc();// static methods can be called using directly class
        computer d = new desktop();
        d.show();
        d.config();
    }
}
