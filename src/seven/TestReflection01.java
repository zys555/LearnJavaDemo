package seven;

class BookTR{
    private String title;
    private double price;
    public void setPrice(double price){
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return "图书名称："+this.title + ". 价格"+this.price;
    }
}


// 根据对象找到类
public class TestReflection01 {
    public static void main(String[] args)throws Exception{
        Class<?>cls = Class.forName("seven.BookTR");
        BookTR book = (BookTR)cls.newInstance(); // 实例化一个对象
        book.setTitle("Java开发实战经典");
        book.setPrice(79.8);
        System.out.println(book);
    }

}
