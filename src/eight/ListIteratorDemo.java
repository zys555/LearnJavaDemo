package eight;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Welcome");
        al.add("to");
        al.add("HAUT");
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            Object element = litr.next();
            System.out.print(element + " ");
        }
        System.out.print("将列表反向输出：");

        while (litr.hasPrevious()){
            Object element = litr.previous();
            System.out.print(element + " ");
        }
    }
}
