package test;

public class usingAttribute {
    static String a = "string-a";
    static String b;

    String c = "string-c";
    String d;

    static {
        printStatic("before static");
        b = "string-b";
        printStatic("after static");

    }

    public static void printStatic(String title){
        System.out.println("-------"+title+"---------");
        System.out.println("a=\"" + a + "\"");
        System.out.println("b=\"" + b + "\"");
    }
    public usingAttribute(){
        print("before constructor");
        d = "string-d";
        print("after constructor");
    }

    public void set(String val){
        this.a = val;
    }

    public void print(String title){
        System.out.println("-------"+title+"-------");
        System.out.println("a=\"" + a + "\"");
        System.out.println("b=\"" + b + "\"");
        System.out.println("c=\"" + c + "\"");
        System.out.println("d=\"" + d + "\"");
    }
    public static void main(String args[]){
        System.out.println();
        System.out.println("--------创建usingAttr对象----------");
        System.out.println();
        usingAttribute attr = new usingAttribute();
        attr.set("asdaaaaaappp----");
        System.out.println("输出类中属性 d" + attr.a);
    }

}
