package five;

public class JudgeString {
    public static void main(String[] args)throws Exception{
        if(isNumber("123")){
            System.out.println("由数字组成");
        }else {
            System.out.println("不是由数字组成");
        }
    }
    public static boolean isNumber(String str){
        char data[] = str.toCharArray();
        for(int x = 0; x < data.length; x++){
            if(data[x] < '0' || data[x]> '9'){
                return false;
            }
        }
        return true;
    }
}
