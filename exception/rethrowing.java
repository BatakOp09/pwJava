//creating your own exception
class ananyo extends Exception{
    public ananyo(){};

    public ananyo(String msg){
        super(msg);
    }
}

public class rethrowing {
    public static void main(String[] args) {
        
        int num1=8;
        int num2 =-2;
        int result =0;
        try{
            if(num2<0){
                Exception e = new ananyo("negative number");
                throw e;
            }
        result = num1/num2;
        System.out.println(result);
        }
        catch(Exception e){
            System.out.println("error occured "+e.getMessage());
        }
    }
}
