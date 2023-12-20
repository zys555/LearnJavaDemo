package eleven;
import java.io.*;

public class eleven {
    public static void main(String[] args)throws Exception{
        byte b [] = "大家一阿里大".getBytes("ISO8859-1");
        OutputStream out = new FileOutputStream(new File("d:" + File.separator + "encoding.txt"));
        out.write(b);
        out.close();
    }
}
