package eight;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> LL = new LinkedList<String>();
        LL.add("F");
        LL.add("F");
        LL.add("D");
        LL.add("E");
        LL.add("C");
        LL.addLast("Z");
        LL.addFirst("A");
        System.out.println("LL最初的内容：" + LL);
        LL.remove("F");
        System.out.println("删除元素F后的LL内容：" + LL);
        LL.remove(2);
        System.out.println("从LL移除第二个元素后的内容之后：" +LL);
        Object val = LL.get(2);
        LL.set(2,(String)val + "Changed");
        System.out.println("LL被改变之后："+LL);
    }
}
