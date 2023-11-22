package eight;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(new Integer(1000- 2000), "张三");
        tm.put(new Integer(1000- 1500), "李三");
        tm.put(new Integer(1000- 2500), "王三");
        tm.put(new Integer(1000- 5000), "赵Ⅷ");

        Collection<String> col = tm.values();
        Iterator<String> i = col.iterator();
        System.out.println("按工资高低输出");
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
