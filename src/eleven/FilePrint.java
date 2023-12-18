package eleven;

import java.io.*;

public class FilePrint {
    public static void main(String[] args){
        PrintWriter out = null;
        File f = new File("d:\\temp.txt");
        try{
            out = new PrintWriter(new FileWriter(f));
        }catch (IOException e){
            e.printStackTrace();
        }
        out.print("Hello world" + "\r\n");
        out.close();
    }
}
