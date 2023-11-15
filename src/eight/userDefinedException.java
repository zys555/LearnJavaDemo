package eight;


// 自定义异常类
public class userDefinedException {
    public static void main(String[] args){
        try{
            throw new MyExpection("自定义异常----仅为测试使用");
        }catch (MyExpection e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}


class MyExpection extends Exception{
    public MyExpection(String msg){
        super(msg);
    }
}