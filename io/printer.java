import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class printer 
 {
    public static void main(String[] args) throws IOException
     {
        
        File dir = new File("io");

        File file = new File(dir,"pw.txt");

        FileWriter fw =  new FileWriter(file);

        PrintWriter p = new PrintWriter(fw);

        p.write(97);
        p.write("\n");

        p.println(100);
        p.print(true);
        p.println(50.5);

        p.close();


    }
}
