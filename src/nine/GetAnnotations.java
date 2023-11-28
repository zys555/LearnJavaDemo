package nine;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class InfoGA{
    @Override
    @Deprecated
    @SuppressWarnings(value = "This is a warining!")
    public String toString(){
        return "Hello world";
    }
}

public class GetAnnotations {
    public static void main(String[] args)throws Exception{
        Class<?> cls = Class.forName("nine.InfoGA");
        Method toStringMethod = cls.getMethod("toString");
        Annotation ans[] = toStringMethod.getAnnotations();
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
