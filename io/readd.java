import java.io.*;

public class readd {
    public static void main(String[] args) throws IOException
    {
         
        File dir = new  File("pw JAVA");

        File file = new File(dir,"java.txt");

        FileReader fr = new FileReader(file);

        char []ch = new char[(int)file.length()];

        fr.read(ch);

        for(char data :ch){
            System.out.print(data);
        }

        //int i = fr.read();

        // while(i != -1){
        //     System.out.print(i +"----->>");

        //     System.out.println((char)i);

        //     i= fr.read(); i++
        // }

    }
}
