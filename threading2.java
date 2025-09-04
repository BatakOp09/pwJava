class Mythread extends Thread{

    public void run(){
        System.out.println("child thread");
    }

}

public class threading2 {
    public static void main(String[] args) {
        System.out.println("main thread");
        Mythread t = new Mythread();//creating object Thread class in background
        t.start();
    }
}
