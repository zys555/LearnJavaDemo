package eight;

import java.io.*;
import java.util.*;

public class PropertiesFile {
    public static void main(String[] args){
        Properties settings = new Properties();
        try{
            settings.load(new FileInputStream("D:\\JavaWork\\count.txt"));
        }catch (Exception e){
            settings.setProperty("count", new Integer(0).toString());
        }

        int c = Integer.parseInt(settings.getProperty("count"))+1;
        System.out.println("这是本程序第" + c +"次使用");
        settings.put("count", new Integer(c).toString());
        try{
            settings.store(new FileOutputStream("D:\\JavaWork\\count.txt"),"PropertiesFile use it");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
