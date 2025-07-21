import java.util.*;

public class multiexp {
   public static void main(String[] args) {

        int num =0;

        Scanner sc = new Scanner(System.in);

        try{
            num = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("something went wrong "+e);
        }
        finally{
            sc.close();
        }
        System.out.println(num);
   } 
}
