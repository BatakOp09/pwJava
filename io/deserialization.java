import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
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


public class deserialization {
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis = new FileInputStream("pwl.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        cricketer cr = (cricketer)ois.readObject();

        cr.display();

        ois.close();
    }
}
