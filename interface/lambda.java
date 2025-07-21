@FunctionalInterface
interface car{
    void drive(int avg, int speed);
}

public class lambda {
    public static void main(String[] args) {
        
        car obj = (avg,speed) -> System.out.println("driving..." + avg+ " top speed is "+speed);

        obj.drive(30,80);
    }
}
