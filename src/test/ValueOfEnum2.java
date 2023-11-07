package test;

enum MyColor5{红色,绿色,蓝色}

public class ValueOfEnum2 {
    public static void main(String[] args){
        MyColor5 c = MyColor5.valueOf(MyColor5.class, "红色");
        System.out.println(c);
    }
}
