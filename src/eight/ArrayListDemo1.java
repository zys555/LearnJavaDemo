package eight;
import java.util.*;

public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("al中元素的个数：" + al.size());
        al.add("c");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("al加入元素之后的元素个数："+al.size());
        System.out.println("al的内容："+al);
        al.remove("F");
        al.remove(2);
        System.out.println("al删除元素后的元素个数："+al.size());
        System.out.println("al的内容："+al);
    }
}
