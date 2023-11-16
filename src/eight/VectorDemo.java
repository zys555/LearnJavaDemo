package eight;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args){
        Vector<String> v= new Vector<String>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");
        Enumeration<String> e = v.elements();
        System.out.println(v);
        while (e.hasMoreElements()){
            System.out.println(e.nextElement() + "");
        }
    }
}
