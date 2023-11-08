package six;

public class StringSearch {
    public static void main(String[] args){
        String str = "**hello$$world##";
        if(str.contains("hello")){
            System.out.println("内容存在，已查到！");
        }
        if(str.indexOf("r")!=-1){
            System.out.println("内容存在，字符串位置：" + str.indexOf("r"));
        }
        if(str.indexOf("o",6)!=-1){
            System.out.println("内容存在，字符串位置：" + str.indexOf("o",6));
        }
        if(str.lastIndexOf("w",12)!=-1){
            System.out.println("内容存在，字符串位置"+str.lastIndexOf("w",12));
        }

        System.out.println(str.startsWith("**"));
        System.out.println(str.startsWith("$$",7));
        System.out.println(str.endsWith("##"));
    }
}
