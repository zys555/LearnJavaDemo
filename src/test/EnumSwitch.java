package test;

enum MyColor2{红色, 绿色, 蓝色};

public class EnumSwitch {
    public static void main(String[] args){
        MyColor2 c1 = MyColor2.绿色;
        switch (c1){
            case 红色:{
                System.out.println("我是红色");
                break;
            }
            case 绿色:{
                System.out.println("我是绿色");
                break;
            }
            case 蓝色:{
                System.out.println("我是蓝色");
                break;
            }
        }
    }
}
