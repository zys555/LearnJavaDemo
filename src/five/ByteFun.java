package five;

public class ByteFun {
    public static void main(String[] args){
        byte b=23;               //声明一个byte变量
        Byte b1=new Byte(b);      //返回表示b的一个Byte实例
        Byte b2=Byte.valueOf("23");  //返回“23”的Byte对象
        Byte b3=12;              //返回“12”的Byte对象
        int x1=b1.intValue();        //作为一个int型b1值
        int x2=b2.intValue();        //作为一个int型b2值
        int x3=b3.intValue();        //作为一个int型b3值
        System.out.println("b1:"+x1+",b2:"+x2+",b3:"+x3);
        String str1=Byte.toString(b);  //返回b的String对象
        String str2=Byte.toString(b2); //返回b2的String对象
        String str3=b3.toString();     //返回b3的String对象
        System.out.println("str1:"+str1+",str2:"+str2+",str3:"+str3);
        byte bb=Byte.parseByte("23");//将string参数解析为有符号的十进制byte
        System.out.println("Byte.parseByte(\"23\"):"+bb);
        boolean bool1=b1.equals(b2); //将b1与b2比较
        boolean bool2=b1.equals(b3); //将b1与b3比较
        System.out.println("b1.equals(b2):"+bool1+",b1.equals(b3):"+bool2);
    }
}