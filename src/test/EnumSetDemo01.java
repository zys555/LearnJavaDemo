package test;

import java.util.EnumSet;
import java.util.Iterator;

enum Color3{红色,绿色,蓝色}

public class EnumSetDemo01 {
    public static void main(String[] args){
        EnumSet<Color3> eSet = EnumSet.allOf(Color3.class); // 表示将枚举全部的内容设置到集合里边去
        Iterator<Color3> iter= eSet.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
