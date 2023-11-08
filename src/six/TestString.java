package six;

public class TestString {
    public static void main(String[] args){
        String str = "My name is Networkcrazy";
        System.out.println("str的长度"+ str.length());
        System.out.println("第一个字符"+ str.charAt(0));
        String data1[] = str.split("");
        for(int i = 0; i < data1.length; i++){
            if(i == data1.length-1){
                System.out.println("最后一个字符"+data1[i]);
            }
        }

        String data[] = str.split(" ");
        System.out.println("第一个单词" + data[0]);

        System.out.println("crazy 位置"+ str.indexOf("crazy"));
    }
}
