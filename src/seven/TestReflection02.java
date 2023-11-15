package seven;

import java.lang.reflect.Method;
class BookTR02{
    private String title;
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}

public class TestReflection02 {
    public static void main(String[] args)throws Exception{
        String fileName = "title";
        String titleValue = "java开发实战";
        Class<?> cls = Class.forName("seven.BookTR02");
        Object obj = cls.newInstance();
        Method setMethod = cls.getMethod("set" + initcap(fileName),String.class);
        Method getMethod = cls.getMethod("get" + initcap(fileName));
        setMethod.invoke(obj,titleValue);
        System.out.println(getMethod.invoke(obj));

    }
    public static String initcap(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
