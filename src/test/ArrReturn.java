package test;

public class ArrReturn {
    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }

    public static void printArr(int[] arr, String msg){
        System.out.println(msg);
        for(int i : arr){
            System.out.println(i + "");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr = {3,5,2,6,8,4,7};
        int [] arrnew;
        printArr(arr,"排序前");
        arrnew = sort(arr);
        printArr(arr,"排序后");
    }
}
