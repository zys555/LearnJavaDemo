package test;

enum MyColor4{红色,蓝色,绿色}

public class OrderOfEnum {
    public static void main(String[] args){
        MyColor4[] allColor = MyColor4.values();

        for (MyColor4 aColor:allColor){
            System.out.println(aColor.name() + "--->" + aColor.ordinal());
        }
    }
}
