import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class cricketer implements Serializable{
    private int age;
    private String name;
    transient int runs;

    public cricketer(String name,int age, int runs){

        this.name=name;
        this.age=age;
        this.runs=runs;

    }

    public void display(){
         System.out.println(age);
        System.out.println(name);
        System.out.println(runs);
    }
}



public class serilization {
    public static void main(String[] args) throws Exception
     {
        
        cricketer c = new cricketer("virat", 36, 20000);

        FileOutputStream fos = new FileOutputStream("pwl.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(c);

        oos.flush();
    }
}
