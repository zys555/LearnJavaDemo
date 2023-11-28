package nine;

public class SuppressWarningsAnnotation {
    public static void main(String[] args) {
        // 压制 “未使用” 警告信息
        @SuppressWarnings("unused")
        int i;
        System.out.println("Hello world");
    }
}
