package test;

public class ArraySortUsingPackage {
    public static void printArr(int[] arr, String msg){
        System.out.println(msg);
        for(int i:arr){
            System.out.print(i + "");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr = {2,5,63,58,9,6,4,2};
        printArr(arr,"排序前");
        java.util.Arrays.sort(arr);
        printArr(arr, "排序后");
    }
}
