package eight;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Welcome");
        al.add("to");
        al.add("HAUT");

        System.out.print("al 中的内容是：");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.print(element+" ");
        }

        System.out.println();
    }
}
