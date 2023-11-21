package eight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book implements Comparable<Book>{
    private String title;
    private double price;
    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    @Override
    public String toString(){
        return "书名" + this.title + ". 价格：" + this.price + "\n";
    }
    @Override
    public int compareTo(Book b){
        if(this.price > b.price){
            return 1;
        }else if(this.price < b.price){
            return -1;
        }else {
            return 0;
        }
    }
}

public class comparableDemo {
    public static void main(String[] args){
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Oracle 开发实战", 60));
        bookList.add(new Book("Java 开发实战", 69.8));
        bookList.add(new Book("Java web 开发实战", 59.8));
        bookList.add(new Book("Android 开发实战", 58));

        Object obj[] = bookList.toArray();
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));
    }
}
