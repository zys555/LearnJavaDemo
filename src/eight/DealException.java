package eight;

public class DealException {
    public static void main(String[] args){
        try{
            int arr[] = new int[5];
            arr[10] = 7;

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("数组超出绑定范围" + ex);
        }finally {
            System.out.println("一定会执行的代码");
        }
        System.out.println("main()方法结束");
    }
}
