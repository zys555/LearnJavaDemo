package seven;
import java.lang.reflect.Constructor;

class BookTI{
    private String title;
    private double price;
    public BookTI(String title, double price){
        this.title = title;
        this.price = price;
    }
    @Override
    public String toString(){
        return "图书名" + this.title + "价格" + this.price;
    }
}

public class TestInstance {
    public static void main(String[] args)throws Exception{
        Class<?>cls = Class.forName("seven.BookTI");
        Constructor<?>cons = cls.getConstructor(String.class, double.class);
        BookTI book = (BookTI)cons.newInstance("java开发实战", 79.8);
        System.out.println(book);
    }
}
