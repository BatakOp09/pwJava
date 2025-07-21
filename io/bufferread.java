import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferread {
    public static void main(String[] args) throws IOException
    {
         
        File dir = new  File("pw JAVA");

        File file = new File(dir,"pwtext.txt");

        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        // System.out.println(line);

        while(line != null){

            System.out.println(line);
            line=br.readLine();
        }
}
}
