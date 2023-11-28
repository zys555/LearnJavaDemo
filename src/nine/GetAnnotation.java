package nine;

import sun.security.krb5.internal.ASRep;

import java.lang.annotation.*;
import java.lang.reflect.Method;
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    public String key();
    public String value();
}

class InfoGAM{
    @Override
    @Deprecated
    @SuppressWarnings(value = "")
    @MyAnnotation(key = "one", value = "test")
    public String toString(){
        return "Hello";
    }
}

// 使用反射取得指定的Annotation
public class GetAnnotation {
    public static void main(String[] args)throws Exception{
        Class<?> cls = Class.forName("nine.InfoGAM");
        Method toStringMethod = cls.getMethod("toString");
        if(toStringMethod.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation my = null;
            my = toStringMethod.getAnnotation(MyAnnotation.class);
            String key = my.key();
            String value = my.value();
            System.out.println(key+"--->>"+value);
        }
    }
}
