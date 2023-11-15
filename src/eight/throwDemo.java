package eight;

public class throwDemo {
    public static void main(String[] args){
        try{
            throw new ArrayIndexOutOfBoundsException("自定义异常信息");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
