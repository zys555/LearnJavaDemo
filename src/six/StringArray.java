package six;

public class StringArray {
    public static void main(String[] args){
        String str = "hellojava";
        char data[] = str.toCharArray();
        for(int x = 0; x < data.length; x++){
            System.out.println(data[x] + "、");
            data[x] -= 32; // 大小写转换
        }
        System.out.println();
        System.out.println("将全部字符数组变为字符串：" + new String(data));
        System.out.println("将部分字符数组变为字符串：" + new String(data, 5, 4));

    }
}
