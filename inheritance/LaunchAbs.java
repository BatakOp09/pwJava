//Try AI directly in your favorite apps … Use Gemini to generate drafts and refine content, plus get Gemini Advanced with access to Google’s next-gen AI for ₹1,950.00 ₹0 for 1 month

abstract class AeroPlane3
{
    //abstract int age;
    
   abstract public void takeOff();

    abstract public void fly();

    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
}


class CargoPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   } 
   public void alert()//specialized method
   {
    System.out.println("Alert..");
   } 
}

class PassengerPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}
public class LaunchAbs 
{
    public static void main(String[] args) 
    {
            AeroPlane3 ref1=new CargoPlane3();
            ref1.takeOff();
            ref1.fly();
            ref1.landing();
            ((CargoPlane3) ref1).alert();//specialized method can be accessed by child class only so we did 
            //downcasting of the ref1 object.

            AeroPlane3 ref3=new PassengerPlane3();
            ref3.takeOff();
            ref3.fly();
            ref3.landing();

           //AeroPlane3 ref=new AeroPlane3(); you cannot make an object of the abstract class
        
    }
    
}