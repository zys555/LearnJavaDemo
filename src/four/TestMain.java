package four;

public class TestMain {

    public static void main(String[] args){
        int j = args.length;
        if( j !=2){
            System.out.println("输出参数个数有误");
            System.exit(1);
        }
        for (int i = 0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
