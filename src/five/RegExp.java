package five;

public class RegExp {
    public static void main(String[] args){
        if("123".matches("\\d+")){
            System.out.println("由数字组成");
        }else {
            System.out.println("不是由数字组成");
        }
    }
}
