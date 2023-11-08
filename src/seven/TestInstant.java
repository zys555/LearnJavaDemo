package seven;

class Book{
    String title;
    double price;
    public void printInfo(){
        System.out.println("title:" + this.title);
        System.out.println("price:" + this.price);
    }
}

public class TestInstant {
    public static void main(String[] args){
        Book book = null;
        book = new Book();
        book.title = "java程序设计";
        book.price = 39.8;
        book.printInfo();
    }
}
