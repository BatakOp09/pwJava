

public class exception1 {
    public static void main(String args[]){

        int num1= 6;//normal
        int num2 =2;// normal

        int result =0; 
        int val[] ={4,5,6,7};
        String name = null;

        try{
            result = num1 / name.length(); //critical
            System.out.println(val[5]);
            System.out.println("inside the try block");
        }
        catch(ArithmeticException obj){
            System.out.println("Something went wrong: "+obj);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limits");
        }
        catch(Exception e){
            System.out.println("something went wrong ");
        }

        System.out.println("result is " +result);
        System.out.println("bye bye");
    }
}
