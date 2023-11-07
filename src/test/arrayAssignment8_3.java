package test;
import java.util.Random;
import test.usingAttribute;

public class arrayAssignment8_3 {
    public static void main(String args[]){
        Random rand = new Random();
        int a[] = null;
        System.out.println("aaaa  " + a);
        a= new int[rand.nextInt(10)];
        System.out.println("数组的长度为："+a.length);
        for(int i = 0 ; i< a.length; i++){
            a[i] = rand.nextInt(100);
            System.out.println("a["+i+"]="+a[i]);
        }
        usingAttribute attrs = new usingAttribute();

        System.out.println("输出usingAttr \"" + attrs.a);
    }
}
