package eight;

import java.util.*;

public class ArrayDemo2 {
    public static void main(String[] args){
        int arrInt[] = {17,40,12,6,15,16,8,10,18,50};
        Arrays.sort(arrInt);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要查找的整数");
        int search = scan.nextInt();
        for(int i = 0; i < arrInt.length; i++){
            System.out.println(arrInt[i] + " ");
        }
        System.out.println();
        int seaInt = Arrays.binarySearch(arrInt, search);
        if(seaInt >=0){
            System.out.println(search + "是数组的第" + seaInt + 1 + "位元素");
        }else {
            System.out.println(search +"不是数组的元素");
        }
        scan.close();
    }
}
