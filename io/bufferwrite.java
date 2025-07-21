import java.io.*;

public class bufferwrite {
    public static void main(String[] args) throws IOException
    {
        
         File dir = new File("pw JAVA");
         File file = new File(dir,"pwtext.txt");

         FileWriter fw = new FileWriter(file);

         BufferedWriter bw = new BufferedWriter(fw);

         bw.write("hello world");
         bw.newLine();
         bw.write("how are you");
         bw.newLine();
         bw.write(67);

         bw.close();

    }
}
