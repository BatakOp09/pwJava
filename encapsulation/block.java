public class block {
    
    static int age;

    static {
        System.out.println("inside the static block");
        age =21;
    }

     static void disp(){
        System.out.println("inside the static method");
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("inside the main method");
        disp();
    }
}
