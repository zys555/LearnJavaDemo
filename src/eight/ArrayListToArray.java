package eight;

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(new Integer(1));
        al.add(new Integer(2));
        al.add(new Integer(3));
        al.add(new Integer(4));
        System.out.println("ArrayList中的内容："+ al);
//        Object ia[] = al.toArray();
        int sum = 0;
        System.out.println(al.get(1));
        for(int i = 0; i < al.size(); i++){
            sum+=((Integer)al.get(i)).intValue();
        }
        System.out.println("数组累加的结果是："+sum);
    }
}
