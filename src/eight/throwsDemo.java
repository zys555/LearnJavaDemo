package eight;

public class throwsDemo {
    public static void main(String[] args){
        int[] arr = new int[5];
        try{
            setZero(arr,10);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组超出范围");
            System.out.println("异常" + e);
        }
        System.out.println("main()方法结束");
    }
    private static void setZero(int[] arr, int index)throws ArrayIndexOutOfBoundsException{
        arr[index] = 0;
    }
}
