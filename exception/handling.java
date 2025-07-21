class demo{
    public void a() throws Exception
    {
        
        b();
    }
    public void b() throws Exception
    {
        int num1 = 8;
        int num2= 0;
        int result =0;

        result = num1/num2;
        System.out.println(result);
    }
}

public class handling {
    public static void main(String args[]){

        demo d = new demo();
        try{
           d.a(); 
        }
        catch(Exception e){
            System.err.println("error occured "+ e.getMessage());
        }
        

    }
}
