package eight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class iteratorMapDemo {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iter = set.iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,String> me = iter.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }
}
