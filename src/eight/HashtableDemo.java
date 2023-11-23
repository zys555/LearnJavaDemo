package eight;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args){
        Hashtable<String,Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", new Integer(1));
        numbers.put("two", new Integer(2));
        numbers.put("three", new Integer(3));

        Integer n = (Integer)numbers.get("two");
        if(n!=null){
            System.out.println("two=" + n);
        }

        System.out.println(numbers.toString());
    }
}
