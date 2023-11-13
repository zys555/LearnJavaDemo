package seven;
import java.util.Date;

public class TestReflection {
    public static void main(String[] args)throws Exception{
        Date date = new Date();
        Class<?>cls= date.getClass(); // 通过java反射机制得到类的包名
        System.out.println(cls);
    }
}
