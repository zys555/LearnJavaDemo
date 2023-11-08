package six;

public class StringMethod {
    public static void main(String[] args){
        String str = "Hello World...";
        System.out.println("原始字符串内容【" + str +"】" + ".长度："+str.length());
        System.out.println("原始字符串内容【" + str.trim() +"】" + ".长度："+str.trim().length());

        System.out.println("".isEmpty());
        System.out.println(str.isEmpty());
        System.out.println("Hello World!!".toUpperCase()); // 字符串全变大写
        System.out.println("Hello World!!".toLowerCase()); // 字符串权变小写
        System.out.println(str.concat("java"));
    }
}
