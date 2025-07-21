import java.io.*;

public class writter{
    public static void main(String[] args) throws IOException
     {
        
        File dir = new File("pw JAVA");
        System.out.println(dir.isDirectory());

        File file = new File(dir,"java.txt");

        FileWriter fw = new FileWriter(file);

        fw.write(66);
        fw.write("mc bc");
        fw.write("\n");
        fw.write("pw");
        fw.write("\n");
        fw.write("hello world");
        fw.write("\n");
        char []ch ={'j','a','v','a'};
        fw.write(ch);

        fw.flush();
    
    }
}