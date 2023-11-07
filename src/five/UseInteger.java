package five;

public class UseInteger {
    public static void main(String[] args){
        Integer num1 = new Integer(100);
        Integer num2 = Integer.valueOf(200);
        Integer num3 = 300;
        System.out.println("三种不同的创建方式" + num1 +" "+num2+" "+num3);
    }
}
