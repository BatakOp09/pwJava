class hello implements Runnable{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            System.out.println("focus is very important");
            Thread.sleep(5000);
        }
    }
        catch(InterruptedException e){
        System.err.println("interrupted");
    }
    
}
}

public class interrupt {
    public static void main(String args[]){
        hello h = new hello();
        Thread t= new Thread(h);

        t.start();
        t.interrupt();
    }
}
