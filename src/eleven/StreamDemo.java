package eleven;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class StreamDemo {
    public static void main(String[] args){
        File f = new File("d:\\temp.txt");
        OutputStream out = null;
        try{
            out = new FileOutputStream(f);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        byte b[] = "Hello World!!!".getBytes();
        try{
            out.write(b);
        }catch (IOException el){
            el.printStackTrace();
        }
        try{
            out.close();
        }catch (IOException e2){
            e2.printStackTrace();
        }
        // 以下为读文件操作
        InputStream in = null;
        try{
            in = new FileInputStream(f);
        }catch (FileNotFoundException e3){
            e3.printStackTrace();
        }
        // 开辟一个空间用于接受文件读进来的数据
        byte b1[] = new byte[1024];
        int i = 0;
        try{
            //将b1的引用传递到read（）方法之中，此方法返回读入数据的个数
            i = in.read(b1);
        }catch (IOException e4){
            e4.printStackTrace();
        }

        try{
            in.close();
        }catch (IOException e5){
            e5.printStackTrace();
        }
        //将byte数组转换为字符串输出
        System.out.println(new String(b1,0,i));
    }
}
