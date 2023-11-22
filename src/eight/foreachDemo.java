package eight;

import java.util.ArrayList;
import java.util.List;

public class foreachDemo {
    public static void main(String[] args){
        List<String> all = new ArrayList<String>();
        all.add("Hello");
        all.add("World");
        all.add("Java");
        for(String str: all){
            System.out.println(str);
        }
    }
}
