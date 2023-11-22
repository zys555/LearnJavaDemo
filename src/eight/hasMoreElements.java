package eight;

import java.util.Enumeration;
import java.util.Vector;

public class hasMoreElements {
    public static void main(String[] args){
        Vector<String> all = new Vector<String>();
        all.add("Hello");
        all.add("world");
        all.add("java");

        Enumeration<String> enu = all.elements();
         while (enu.hasMoreElements()){
             String str = enu.nextElement();
             System.out.println(str);
         }
    }
}
