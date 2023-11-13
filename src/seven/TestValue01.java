package seven;

public class TestValue01 {
    public static void change(int[] count){
        count[0] = 0;
        System.out.println("在方法内部count【0】 =" + count[0]);
    }

    public static void main(String[] args){
        String str = "Microsoft Windows GDI Component信息泄露漏洞（CNVD-2019-24746）";
        int[] count = {1,2,3,4,5};
        System.out.println("方法执行前count[0] = " + count[0]);
        change(count);
        System.out.println("方法执行后count[0]= " + count[0]);
        System.out.println("changdu====" + str.length());
    }

}
