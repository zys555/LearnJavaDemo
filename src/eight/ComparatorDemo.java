package eight;

import sun.reflect.generics.tree.Tree;

import java.util.*;

class MyComp implements Comparator<Object>{
    public int compare(Object o1, Object o2){
        String aStr, bStr;
        aStr = (String)o1;
        bStr = (String)o2;
        return bStr.compareTo(aStr);
    }
}

public class ComparatorDemo {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        Iterator<String> i = ts.iterator();
        while (i.hasNext()){
            Object element = i.next();
            System.out.print(element+" ");
        }

    }

}
