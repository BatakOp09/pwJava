

public class threading1 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("before changing");
        String Name = Thread.currentThread().getName();
        System.out.println("the current thread name is "+Name);
        System.out.println("the priority of the thread is "+Thread.currentThread().getPriority());

        System.out.println("after changing ");
        Thread t = Thread.currentThread();
        t.setName("ananyo");
        t.setPriority(2);
        System.out.println("the name of the thread after changing "+Thread.currentThread().getName()+" the priority of the thread is "+Thread.currentThread().getPriority());
    }
}
