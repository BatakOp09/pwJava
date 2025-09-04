import java.util.*;

class calc implements Runnable{
    public void run(){
        System.out.println("calculation started !");
        System.out.println("-------------------------------");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("enter the second number: 45");
        int num2 = s.nextInt();
        int res = num1 + num2;
        System.out.println("result is : "+res);
        System.out.println("the multiplication is : "+(num1*num2));
        System.out.println("calculation task has ended !");
        System.out.println("-----------------------------------------------");

    }
}

class display implements Runnable{
    public void run(){
    System.out.println("diplay has started!");
    for(int i=0;i<3;i++){
        System.out.println("focus soldier");
    }
    System.out.println("displaying message has ended");
}
}


public class implementt {
    public static void main(String[] args) {
        
        calc c1 = new calc();
        display d2 = new display();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();
    }
}

