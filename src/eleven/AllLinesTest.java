package eleven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class AllLinesTest {
    public static void main(String[] args)throws Exception{
        File file = new File("d:" + File.separator + "2.txt");
        List<String> lineList = Files.readAllLines(file.toPath());
        for(String temp : lineList){
            System.out.println(temp);
        }
    }
}
