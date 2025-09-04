import java.util.Scanner;

class calc extends Thread{
    public void run(){
        System.out.println("calculation started !");
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        
        try{
            
            System.out.println("enter the first number: ");
            Thread.sleep(10000);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("result is : "+res);
        System.out.println("the multiplication is : "+(num1*num2));
        }
        catch(Exception e){
            System.err.println("something went wrong");
        }
        System.out.println("calculation task has ended !");
        System.out.println("-----------------------------------------------");

    }
}

class display extends Thread{
    public void run(){
    System.out.println("diplay has started!");
    try{Thread.sleep(5000);//delay of 5 seconds or 5000 milliseconds
    for(int i=0;i<3;i++){
        System.out.println("focus soldier");
    }
}
catch(Exception e){
    System.out.println("something went wrong");
}
    System.out.println("displaying message has ended");
}
}


public class multithreading3 {
    public static void main(String[] args) {
        
        calc t1 = new calc();
        display t2 = new display();

        t1.start();
        t2.start();
    }
}
