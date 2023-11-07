package two;
import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.ArrayList;

class TestReturn{
    private ArrayList<Integer>intArray = new ArrayList<Integer>();
    TestReturn(){
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
    }
    ArrayList<Integer>getIntArray(){
        return intArray;
    }
}

public class ReturnVariable {
    public static void main(String [] args){
        TestReturn testReturn = new TestReturn();
        ArrayList<Integer> intArray = testReturn.getIntArray();
        System.out.println(intArray.size());
        intArray.add(4);
        ArrayList<Integer> intArray2 = testReturn.getIntArray();
        System.out.println("在外部修改其私有变量以后的长度为：" + intArray2.size());
    }

}
