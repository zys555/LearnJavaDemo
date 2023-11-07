package test;

enum MyColor3{红色, 绿色, 蓝色}
public class ValueOfEnum {
    public static void main(String [] args){
        MyColor3[] allColor = MyColor3.values();

        for(MyColor3 aColor:allColor){
            System.out.println(aColor);
        }

    }
}
