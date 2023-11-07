package test;

public class ArrayMethod {
    public static void printArr(int[] arr){
        for(int i :arr){
            System.out.print(i + "");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int[] arr = {3,4,5,6,8,6,9,4};
        int[] arrnew = arr.clone();
        System.out.println("arr.length:" + arr.length);
        System.out.println("------------------");
        System.out.println("arrnew:");
        printArr(arrnew);
        System.out.println("arrnew.length" + arrnew.length);
        if(arr == arrnew){
            System.out.println("数组arr与arrnew的引用地址相同");
        }else {
            System.out.println("数组arr与arrnew的引用地址不同");
        }
    }
}
