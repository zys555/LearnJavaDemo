package eight;

import java.util.*;
import java.util.Map.Entry;

class Employee implements Comparator<Object>{
    public int compare(Object a, Object b){
        int k;
        String aStr, bStr;
        aStr = (String)a;
        bStr = (String)b;
        k = aStr.compareTo(bStr);
        if(k==0){
            return aStr.compareTo(bStr);
        }else {
            return k;
        }

    }
}

// 使用TreeMap程序实现存储账目资产平衡表
public class TreeMapDemo2 {
    public static void main(String[] args){
        TreeMap<String,Double> tm = new TreeMap<String, Double>(new Employee());
        tm.put("Z、张三",new Double(3534.34));
        tm.put("L、李四",new Double(126.22));
        tm.put("W、王五",new Double(1578.40));
        tm.put("Z、赵六",new Double(99.62));
        tm.put("S、孙七",new Double(-29.08));

        Set<Entry<String,Double>> set = tm.entrySet();
        Iterator<Entry<String,Double>> itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry<String, Double> me = (Map.Entry<String, Double>) itr.next();
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = ((Double)tm.get("Z、张三")).doubleValue();
        tm.put("Z、张三", new Double(balance + 2000));
        System.out.println("张三最新的资金数为：" + tm.get("Z、张三"));
    }

}
