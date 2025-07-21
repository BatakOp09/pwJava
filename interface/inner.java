//inner = member, static, Anonymous

class a{
    public void display(){
        System.out.println("inside display");

    }
    static class b{
        public void show(){
            System.out.println("inside show");
        }
    }
}

public class inner {
    public static void main(String[] args) {
        a obj = new a();
        a.b obj1 = new a.b();

        obj.display();
        obj1.show();
    }
}
