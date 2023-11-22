package eight;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String,Double> hm = new HashMap<String, Double>();
        hm.put("John Doe", new Double(3434.34));
        hm.put("Tmo Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Todd Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.88));
        // 返回包含映射中项的集合
        Set<Entry<String,Double>> set = hm.entrySet();
        // 用Iterator 得到HashMap中的内容
        Iterator<Entry<String,Double>> i = set.iterator();
        // 显示元素
        while (i.hasNext()){
            Map.Entry<String,Double> me = (Map.Entry<String, Double>) i.next();
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = ((Double)hm.get("John Doe")).doubleValue();
        hm.put("John Doe", new Double(balance+1000));
        System.out.println("John Doe's 现在的资金："+hm.get("John Doe"));
    }
}
