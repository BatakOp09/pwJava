class car implements Runnable{
     public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" entered the parking lot");
            Thread.sleep(2000);
            synchronized(this){
            System.out.println(Thread.currentThread().getName()+" got into the car to start driving");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " started driving");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" parked the car after driving");
            }
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}

public class synchronization {
    public static void main(String[] args) {

        car cv = new car();

        Thread t1 = new Thread(cv);
        Thread t2 = new Thread(cv);
        Thread t3 = new Thread(cv);

        t1.setName("ram");
        t2.setName("shyam");
        t3.setName("madhu");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
