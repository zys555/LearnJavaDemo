package eight;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);

        HashSet<Integer> hsI = new HashSet<Integer>();

        hsI.add(5);
        hsI.add(4);
        hsI.add(8);
        hsI.add(3);
        hsI.add(9);

        System.out.println(hsI);
    }
}
