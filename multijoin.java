 class demo implements Runnable {
    public void run(){
        try{
            for(int i=0;i<3;i++){
                System.out.println("focus is important");
            }
        }
        catch(Exception e){
            System.out.println("something wrong occured");
        }
    }
}


public class multijoin{
    public static void main(String[] args)throws Exception { 
        System.out.println("main thread started");
        demo p = new demo();

        Thread t1 = new Thread(p);

        System.out.println(t1.isAlive());
        t1.start();

        System.out.println(t1.isAlive());
        t1.join();


        System.out.println("main thread completed its work");
    }
}