 class Demo1 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Executing");
        try{
            Thread.sleep(3000);// waiting state for sleep() or wait()
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        System.out.println("Child thread task completed");
    }
}
public class states
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread started");

        Demo1 d=new Demo1();

        Thread t1=new Thread(d);// new state

        t1.start();//goes to runnable state
      
      
    }
    
}
