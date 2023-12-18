package eleven;

import java.io.*;

public class SystemPrintDemo {
    public static void main(String[] args){
        PrintWriter out = null;
        out = new PrintWriter(System.out);
        out.print("JAVA -YES");
        out.close();
    }
}
