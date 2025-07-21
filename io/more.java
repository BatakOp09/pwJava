import java.io.File;
import java.io.IOException;

public class more {
    public static void main(String[] args) throws IOException
    {
        
        // File dir = new File("pw JAVA");
        //  dir.mkdir();

        // System.out.println(dir.isDirectory());

        // File file = new File(dir,"pwtext.txt");

        // file.createNewFile();
        // System.out.println(file.isFile());

        //  File file1 = new File(dir,"java.txt");

        //  file1.createNewFile();
        //  System.out.println(file1.isFile());


        int count =0;

        File f = new File("pw JAVA");

        String str[] = f.list();

        for(String name : str){
            count ++;
            System.out.println(name);
        }

        System.out.println("no.of files are :"+count);
    }
}
